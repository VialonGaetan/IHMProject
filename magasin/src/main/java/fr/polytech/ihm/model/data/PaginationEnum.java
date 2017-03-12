package fr.polytech.ihm.model.data;

/**
 * @author Alexandre Clement
 * @since 12/03/2017.
 */
public enum PaginationEnum
{
    HARRY_POTTER("images/harry-potter-et-les-reliques-de-la-mort-partie-2-banniere.jpg"),
    LIBRARY("images/home_presentation_image.jpg");

    private final String page;

    PaginationEnum(String page)
    {
        this.page = page;
    }

    public String getPage()
    {
        return page;
    }
}
