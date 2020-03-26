package app;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class App {

    protected static final String DATE_BR = "dd/MM/yyyy";
    public static final String DATE_ISO8601 = "yyyy-MM-dd'T'HH:mm:ss.SSS";

    public static String formatDate(String format, Date date) {
        SimpleDateFormat formatDate = new SimpleDateFormat(format);
        // System.out.println(formatDate.toPattern());
        return formatDate.format(date);
    }

    public static void main(String[] args) throws Exception {

        String actualDate = formatDate(DATE_BR, new Date());
        System.out.println("Actual Date: " + actualDate);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_BR);

        Date date = simpleDateFormat.parse(actualDate);
        System.out.println("Date: " + date);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);
        System.out.println("Month: " + month + 1); // The months start counting at 0 so add 1

    }
}