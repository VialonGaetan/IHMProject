package fr.polytech.ihm.model.data;

import fr.polytech.ihm.model.command.Command;
import fr.polytech.ihm.model.product.Product;

import java.util.*;

/**
 * @author Alexandre Clement
 * @since 12/03/2017.
 */
public class Data
{
    private static final Data data = new Data();
    private final Map<String, Command> commands;

    private Data()
    {
        commands = new HashMap<>();

        List<Product> basket0 = new ArrayList<>();
        basket0.add(ProductEnum.HARRY_POTTER_2.getProduct());
        basket0.add(ProductEnum.HARRY_POTTER_3.getProduct());
        Command command0 = new Command(0, basket0, new Date());
        addCommand(command0);
    }

    public static Data getInstance()
    {
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
}
