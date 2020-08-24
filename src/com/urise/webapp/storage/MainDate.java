package com.urise.webapp.storage;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by iStyle on 19.08.2020.
 */
public class MainDate {
    public static void main(String[] args) {
       long start = System.currentTimeMillis();
        Date date = new Date();
        System.out.println(date);
        System.out.println(System.currentTimeMillis() - start);
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("Moscow"));
        System.out.println(cal.getTime());

    }
}
