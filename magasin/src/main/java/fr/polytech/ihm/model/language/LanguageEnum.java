package fr.polytech.ihm.model.language;

/**
 * @author Alexandre Clement
 * @since 12/03/2017.
 */
public enum LanguageEnum
{
    FR("images/langues/france3.jpg"),
    ENG("images/langues/drapeau-royaume-uni3.jpg");

    private final String image;

    LanguageEnum(String image)
    {
        this.image = image;
    }

    public String getImage()
    {
        return image;
    }
}
