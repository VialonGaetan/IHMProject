package fr.polytech.ihm.model.data;

import fr.polytech.ihm.model.product.Product;

/**
 * @author Alexandre Clement
 * @since 12/03/2017.
 */
public enum ProductEnum
{
    HARRY_POTTER_2(new Product("images/harry-potter-1-a-lecole-des-sorciers.png", "Harry Potter à l'école des sorciers", "Il est adapté du roman du même nom de J. K. Rowling et constitue le premier volet de la série de films Harry Potter.", 10)),
    HARRY_POTTER_3(new Product("images/harry-potter-et-le-prisonnier-d-azkaban.png", "Harry Potter et le Prisonnier d'Azkaban", "Il est adapté du roman du même nom de J. K. Rowling et constitue le troisième volet de la série de films Harry Potter.", 15));

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
