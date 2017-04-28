package sg.edu.rp.c346.p02_holidays;

/**
 * Created by 15056215 on 28/4/2017.
 */

public class Holidays {
    private String name;
    private String date;


    public Holidays(String name, String date){
        this.name = name;
        this.date = date;

    }
    public String getName(){
        return name;
    }
    public String getDate(){
        return date;
    }


}
