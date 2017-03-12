package fr.polytech.ihm.model.language;

/**
 * @author Alexandre Clement
 * @since 12/03/2017.
 */
@FunctionalInterface
public interface Language
{
    String get(LanguageEnum language);
}
