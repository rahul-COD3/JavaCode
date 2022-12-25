package Practice.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
Class	                                                                                  Description

  LocalDate	                                                              Represents a date (year, month, day (yyyy-MM-dd))
  LocalTime	                                                              Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
  LocalDateTime	                                                          Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
  DateTimeFormatter	                                                      Formatter for displaying and parsing date-time objects

*/

public class Basics {
  public static void main(String[] args) {

    // for printing current date;
    LocalDate myDate = LocalDate.now();
    System.out.println(myDate);

    // print current time
    System.out.println(LocalTime.now());

    // For printing local Date and Time both

    System.out.println(LocalDateTime.now());

    // for formatting local date and time both

    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);

  }
}