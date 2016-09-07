/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Rahal
 */
public class CurrentDateandTime {

    

    public static String getcurrentdate() {
 Calendar cal = new GregorianCalendar();
        String month = String.valueOf(cal.get(Calendar.MONTH));
        String year = String.valueOf(cal.get(Calendar.YEAR));
        String date = String.valueOf(cal.get(Calendar.DATE));

        return year + "-" + month + "-" + date;
    }

    public static String getcurrenttime() {
         Calendar time = new GregorianCalendar();
        String hour = String.valueOf(time.get(Calendar.HOUR_OF_DAY));
        String minute = String.valueOf(time.get(Calendar.MINUTE));
        String seconds = String.valueOf(time.get(Calendar.SECOND));

        return hour + ":" + minute + ":" + seconds;
    }
}
