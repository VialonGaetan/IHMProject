package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.language.Language;
import fr.polytech.ihm.model.language.LanguageEnum;

/**
 * @author Alexandre Clement
 * @since 12/03/2017.
 */
public enum ViewEnum implements Language
{
    HOME("/fxml/home.fxml", "Acceuil", "Home"),
    PRODUCT("/fxml/product_page.fxml", "Nos Produits", "Product"),
    COMMAND("/fxml/command_page.fxml", "Les Commandes", "Command"),
    OTHERMAG("/fxml/othermag_page.fxml", "Les autres magasins","Other stores"),
    CONTACT("/fxml/contact_page.fxml", "Nous contacter","Contact us");


    private final String fxml;
    private final String[] languages;

    ViewEnum(String fxml, String... languages)
    {
        this.fxml = fxml;
        this.languages = languages;
    }

    public String getFxml()
    {
        return fxml;
    }

    @Override
    public String get(LanguageEnum language)
    {
        return languages[language.ordinal()];
    }
}
