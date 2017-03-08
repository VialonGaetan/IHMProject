package fr.polytech.ihm.model.shop;

import fr.polytech.ihm.model.EnumDay;

/**
 * Created by IHMProject on 08/03/17
 */
public class DaySchedules {
    private int openinghour;
    private int closingtime;
    private EnumDay day;

    DaySchedules(EnumDay day,int openinghour,int closingtime){
        this.day = day;
        this.openinghour = openinghour;
        this. closingtime = closingtime;
    }

    public int getOpeninghour() {return openinghour;}

    public int getClosingtime() { return closingtime;}

    public EnumDay getDay() { return day; }
}
