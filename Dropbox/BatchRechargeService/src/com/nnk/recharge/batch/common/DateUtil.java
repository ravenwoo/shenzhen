package com.nnk.recharge.batch.common;

import org.apache.log4j.Logger;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * The type Date util.
 */
public class DateUtil {
    private static final Logger logger = Logger.getLogger(DateUtil.class);

    /**
     * Format date string.
     *
     * @param date    the date
     * @param pattern the pattern
     * @return the string
     */
    public static String formatDate(Date date, String pattern) {
        DateFormat format = new SimpleDateFormat(pattern);
        return format.format(date);
    }

    /**
     * Parse date.
     *
     * @param source  the source
     * @param pattern the pattern
     * @return the date
     */
    public static Date parse(String source, String pattern) {
        DateFormat format = new SimpleDateFormat(pattern);
        Date parseDate = null;
        try {
            parseDate = format.parse(source);
        } catch (ParseException e) {
            logger.error("日期" + source + "格式转换错误,获取当前时间" + new Date());
            parseDate = new Date();
        }
        return parseDate;
    }

    /**
     * Change date format string.
     *
     * @param date     the date
     * @param oldFomat the old fomat
     * @param newFomat the new fomat
     * @return the string
     */
    public static String changeDateFormat(String date, String oldFomat, String newFomat) {
        Date temp = parse(date, oldFomat);
        if (temp == null) {
            return null;
        }
        return formatDate(temp, newFomat);
    }

    /**
     * 得到几天前的时间
     *
     * @param d   the d
     * @param day the day
     * @return date before
     */
    public static Date getDateBefore(Date d, int day) {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
        return now.getTime();
    }

    /**
     * 得到几天前的时间 String yyyy-MM-dd
     *
     * @param d   the d
     * @param day the day
     * @return date before
     */
    public static String getDateBefore(String d, int day) {
        Calendar now = Calendar.getInstance();
        now.setTime(parse(d, "yyyy-MM-dd"));
        now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
        return formatDate(now.getTime(), "yyyy-MM-dd");
    }

    /**
     * 得到几天后的时间
     *
     * @param d   the d
     * @param day the day
     * @return date after
     */
    public static Date getDateAfter(Date d, int day) {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(Calendar.DATE, now.get(Calendar.DATE) + day);
        return now.getTime();
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Date date = parse("2015-11-27", "yyyy-MM-dd");
        System.out.println(getDateBefore(date, 30));
    }

}
