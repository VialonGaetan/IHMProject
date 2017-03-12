package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.language.Language;
import fr.polytech.ihm.model.language.LanguageEnum;

/**
 * @author Alexandre Clement
 * @since 12/03/2017.
 */
public enum ViewEnum implements Language
{
    HOME("Acceuil", "Home"),
    PRODUCT("Nos Produits", "Product"),
    COMMAND("Les Commandes", "Command");


    private final String[] languages;

    ViewEnum(String... languages)
    {
        this.languages = languages;
    }


    @Override
    public String get(LanguageEnum language)
    {
        return languages[language.ordinal()];
    }
}
