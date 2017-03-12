package fr.polytech.ihm.model.product;

import fr.polytech.ihm.model.language.Language;
import fr.polytech.ihm.model.language.LanguageEnum;

/**
 * @author Alexandre Clement
 * @since 12/03/2017.
 */
public enum ProductType implements Language
{
    BOOK("Livre", "Book"),
    CD("CD", "CD"),
    DVD("DVD", "DVD"),
    STAGE("Stages", "Stages");

    private final String[] languages;

    ProductType(String... languages)
    {
        this.languages = languages;
    }

    public static ProductType productTypeOf(String string)
    {
        for (ProductType productType : ProductType.values())
        {
            for (String language : productType.languages)
            {
                if (language.equals(string))
                    return productType;
            }
        }
        return null;
    }

    @Override
    public String get(LanguageEnum language)
    {
        return languages[language.ordinal()];
    }
}
