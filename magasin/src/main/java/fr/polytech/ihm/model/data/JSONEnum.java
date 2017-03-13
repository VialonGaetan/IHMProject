package fr.polytech.ihm.model.data;

/**
 * @author Alexandre Clement
 * @since 13/03/2017.
 */
public enum JSONEnum
{
    LIST("liste"),
    SRC_IMAGE("srcImage"),
    SRC_PROMO("srcPromo"),
    LABEL_TITLE("labelTitle"),
    LABEL_DESCRIPTION("labelDescri"),
    OLD_PRICE("oldPrice"),
    NEW_PRICE("newPrice"),
    CATEGORY("categorie");

    private final String key;

    JSONEnum(String key)
    {
        this.key = key;
    }

    @Override
    public String toString()
    {
        return key;
    }
}
