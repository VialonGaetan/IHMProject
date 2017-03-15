package fr.polytech.ihm.model.shop;

/**
 * Created by IHMProject on 15/03/17
 */
public enum ShopEnum {

    LIST("liste"),
    NAME("nom"),
    ADRESS("adress"),
    SCHEDULES("horaires"),
    PHONE("tel"),
    EMAIL("email");

    private final String key;

    ShopEnum(String key)
    {
        this.key = key;
    }

    @Override
    public String toString()
    {
        return key;
    }
}
