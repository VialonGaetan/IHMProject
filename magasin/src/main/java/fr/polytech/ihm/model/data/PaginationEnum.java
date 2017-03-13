package fr.polytech.ihm.model.data;

import fr.polytech.ihm.model.product.Product;

/**
 * @author Alexandre Clement
 * @since 12/03/2017.
 */
public enum PaginationEnum
{
    HARRY_POTTER("images/harry-potter-et-les-reliques-de-la-mort-partie-2-banniere.jpg", ProductEnum.HARRY_POTTER_1.getProduct()),
    LIBRARY("images/home_presentation_image.jpg"),
    HARRY_POTTER_7("images/harry-potter-the-deathly-hallows-part-2-wallpaper1.jpg", ProductEnum.HARRY_POTTER_7_PART_2.getProduct());

    private final String page;
    private Product product;

    PaginationEnum(String page)
    {
        this.page = page;
    }

    PaginationEnum(String page, Product product)
    {
        this(page);
        this.product = product;
    }

    public String getPage()
    {
        return page;
    }

    public Product getProduct()
    {
        return product;
    }
}
