package fr.polytech.ihm.model.shop;

import fr.polytech.ihm.model.EnumDay;

import java.util.HashMap;
import java.util.List;

/**
 * Created by IHMProject on 08/03/17
 */
public class Schedules {
    private DaySchedules mondayschedules;
    private DaySchedules tuesdayschedules;
    private DaySchedules wednesdayschedules;
    private DaySchedules thursdayschedules;
    private DaySchedules fridayschedules;
    private DaySchedules saturdayschedules;
    private DaySchedules sundayschedules;

    Schedules(List<DaySchedules> list){
        this.mondayschedules = list.get(0);
        this.tuesdayschedules = list.get(1);
        this.wednesdayschedules = list.get(2);
        this.thursdayschedules = list.get(3);
        this.fridayschedules = list.get(4);
        this.saturdayschedules = list.get(5);
        this.sundayschedules = list.get(6);

    }

    public HashMap<EnumDay,DaySchedules> getSchedules(){
        HashMap<EnumDay,DaySchedules> hm = new HashMap<EnumDay, DaySchedules>();
        hm.put(EnumDay.LUNDI,mondayschedules);
        hm.put(EnumDay.MARDI,tuesdayschedules);
        hm.put(EnumDay.MERCREDI,wednesdayschedules);
        hm.put(EnumDay.JEUDI,thursdayschedules);
        hm.put(EnumDay.VENDREDI,fridayschedules);
        hm.put(EnumDay.SAMEDI,saturdayschedules);
        hm.put(EnumDay.DIMANCHE,sundayschedules);
        return hm;
    }

}
