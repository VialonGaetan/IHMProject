package fr.polytech.ihm.model.product;

public class Product
{
    private final String image;
    private final String name;
    private final String description;
    private final int price;
    private final double avis;
    private final ProductType productType;

    public Product(String image, String name, String description, int price, double avis, ProductType productType)
    {
        this.image = image;
        this.name = name;
        this.description = description;
        this.price = price;
        this.avis = avis;
        this.productType = productType;
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

    public double getAvis()
    {
        return avis;
    }

    public ProductType getProductType()
    {
        return productType;
    }
}