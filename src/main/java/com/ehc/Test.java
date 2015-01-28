package com.ehc;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ehc on 28/1/15.
 */
public class Test {
  public static void main(String[] args) {
    try {

      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      Date date1 = sdf.parse("2009-12-31");
      Date date2 = sdf.parse("2010-01-31");

      System.out.println(sdf.format(date1));
      System.out.println(sdf.format(date2));

      if (date1.after(date2)) {
        System.out.println("Date1 is after Date2");
      }

      if (date1.before(date2)) {
        System.out.println("Date1 is before Date2");
      }

      if (date1.equals(date2)) {
        System.out.println("Date1 is equal Date2");
      }

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  /*public static void main(String[] args) {
    System.out.println(getCustomer("14/10/1987"));
  }
  public static boolean getCustomer(String dob) {
    boolean flag = false;
    int monthArray[]={31,28,31,30,31,30,31,31,30,31,30,31};
    int day1, day2, day3=0, month1, month2,month3=0, year;
    String date[] = dob.split("/");
    System.out.println("date="+date[0]+"/"+date[1]+"/"+date[2]);
    day1 = Integer.parseInt(date[0]);
    month1 = Integer.parseInt(date[1]);
    Date date1 = DateUtils.addWeeks(new Date(), 2);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
    String dateString = simpleDateFormat.format(date1);
    String nextDate[] = dateString.split("/");
    System.out.println("date="+nextDate[0]+"/"+nextDate[1]+"/"+nextDate[2]);
    day2 = Integer.parseInt(nextDate[0]);
    month2 = Integer.parseInt(nextDate[1]);
    year = Integer.parseInt(nextDate[2]);
    if (day1 > day2) {
      if (month1 <= month2) {
        if (year % 4 == 0 && month2 == 2) {
          day3 = day2 + 29 - day1;
        } else
          day3 = day2 + 28 - day1;
        day3 = day2 + monthArray[month2 - 1] - day1;
        month3=month2-month1;
      }
      else month3=month2-month1;
    }else {
      day3 = day2 - day1;
      month3=month2-month1;
    }
    System.out.println("day3="+day3+"day2="+day2+"day1="+day1);
    System.out.println(5-10);
    if (day3 <= 12 && month3 == 0)
      flag = true;
    return flag;
  }*/
}
