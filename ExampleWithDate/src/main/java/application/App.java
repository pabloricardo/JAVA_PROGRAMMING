package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d1 = sdf.parse("27/04/2019 11:22:33");
        System.out.println(d1);
        System.out.println(sdf.format(d1));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d1);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d1 = cal.getTime();
        System.out.println(d1);

        int minutes = cal.get(Calendar.MINUTE);
        System.out.println(minutes);
    }
}
