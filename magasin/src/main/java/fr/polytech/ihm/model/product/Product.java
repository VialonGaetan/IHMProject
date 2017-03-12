package fr.polytech.ihm.model.product;

public class Product
{
    private final String image;
    private final String name;
    private final String description;
    private final int price;

    public Product(String image, String name, String description, int price)
    {
        this.image = image;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getImage()
    {
        return image;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public int getPrice()
    {
        return price;
    }
}