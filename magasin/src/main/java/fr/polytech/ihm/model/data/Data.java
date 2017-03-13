package fr.polytech.ihm.model.data;

import fr.polytech.ihm.model.command.Command;
import fr.polytech.ihm.model.product.Product;
import fr.polytech.ihm.model.product.ProductType;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Alexandre Clement
 * @since 12/03/2017.
 */
public class Data
{
    private static Data data;
    private final Map<String, Command> commands;
    private List<Product> products;

    private Data() throws FileNotFoundException
    {
        initProduct();
        products.addAll(Arrays.stream(ProductEnum.values()).map(ProductEnum::getProduct).collect(Collectors.toList()));
        commands = new HashMap<>();

        List<Product> basket0 = new ArrayList<>();
        basket0.add(products.get(0));
        basket0.add(products.get(1));
        basket0.add(products.get(1));
        basket0.add(products.get(1));
        basket0.add(products.get(1));
        basket0.add(products.get(1));
        basket0.add(products.get(4));
        basket0.add(products.get(4));
        basket0.add(products.get(4));
        Command command0 = new Command(0, basket0, new Date());
        addCommand(command0);

    }

    private void initProduct() throws FileNotFoundException
    {
        products = new ArrayList<>();
        Scanner scanner = new Scanner(new File("magasin/src/main/resources/json/items.json"));
        JSONObject jsonObject = new JSONObject(scanner.useDelimiter("\\Z").next());
        scanner.close();
        JSONArray list = jsonObject.getJSONArray(JSONEnum.LIST.toString());
        for (int i = 0; i < list.length(); i++)
        {
            JSONObject jsonProduct = list.getJSONObject(i);
            products.add(new Product(
                    jsonProduct.getString(JSONEnum.SRC_IMAGE.toString()),
                    jsonProduct.getString(JSONEnum.LABEL_TITLE.toString()),
                    jsonProduct.getString(JSONEnum.LABEL_DESCRIPTION.toString()),
                    getDouble(jsonProduct, JSONEnum.NEW_PRICE.toString()),
                    getDouble(jsonProduct, JSONEnum.OLD_PRICE.toString()) / getDouble(jsonProduct, JSONEnum.NEW_PRICE.toString()),
                    ProductType.productTypeOf(jsonProduct.getString(JSONEnum.CATEGORY.toString()))));
        }
    }

    private double getDouble(JSONObject jsonProduct, String key)
    {
        String value = jsonProduct.getString(key).replace("€", "");
        return Double.valueOf(value);
    }

    public static Data getInstance() throws FileNotFoundException
    {
        if (data == null)
            data = new Data();
        return data;
    }

    private void addCommand(Command command)
    {
        commands.put(String.valueOf(command.getId()), command);
    }

    public Optional<Command> getCommand(String id)
    {
        if (commands.containsKey(id))
            return Optional.of(commands.get(id));
        return Optional.empty();
    }

    public List<Product> getProducts()
    {
        return products;
    }
}
