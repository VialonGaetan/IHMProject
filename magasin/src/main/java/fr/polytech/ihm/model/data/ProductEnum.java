package fr.polytech.ihm.model.data;

import fr.polytech.ihm.model.product.Product;
import fr.polytech.ihm.model.product.ProductType;

/**
 * @author Alexandre Clement
 * @since 12/03/2017.
 */
public enum ProductEnum
{
    HARRY_POTTER_1(new Product("images/harry-potter-1-a-lecole-des-sorciers.png", "Harry Potter à l'école des sorciers", "Le premier volet de la série de films Harry Potter.", 9.99, 3.5, ProductType.DVD)),
    HARRY_POTTER_3(new Product("images/harry-potter-et-le-prisonnier-d-azkaban.png", "Harry Potter et le Prisonnier d'Azkaban", "Le troisième volet de la série de films Harry Potter.", 15d, 1.3, ProductType.BOOK)),
    HARRY_POTTER_7_PART_2(new Product("images/Harry_Potter_and_the_Deathly_Hallows_–_Part_2.jpg", "Harry Potter et les Reliques de la Mort", "C'est le septième et dernier volet de la série de films Harry Potter.", 69.99, 4.7, ProductType.DVD));

    private final Product product;

    ProductEnum(Product product)
    {
        this.product = product;
    }

    public Product getProduct()
    {
        return product;
    }
}
