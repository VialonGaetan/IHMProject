package fr.polytech.ihm.model.command;

import fr.polytech.ihm.model.product.Product;

import java.util.Date;
import java.util.List;

/**
 * @author Alexandre Clement
 * @since 08/03/2017.
 */
public class Command
{
    private final List<Product> products;
    private final Date deliveryDate;
    private final int id;

    public Command(int id, List<Product> products, Date deliveryDate)
    {
        this.id = id;
        this.products = products;
        this.deliveryDate = deliveryDate;
    }

    public int getId()
    {
        return id;
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public Date getDeliveryDate()
    {
        return deliveryDate;
    }
}
