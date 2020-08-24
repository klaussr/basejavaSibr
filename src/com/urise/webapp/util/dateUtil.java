package com.urise.webapp.util;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by iStyle on 19.08.2020.
 */
public class dateUtil {
    public static LocalDate of(int year, Month month) {
        return LocalDate.of(year, month, 1);
    }

    public static final LocalDate NOW = LocalDate.of(3000, 1, 1);
}
