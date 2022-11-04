/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ramir
 */
public class Time {

          String hour, day;

          public String getTime() {
                    this.hour = ZonedDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
                    return hour;
          }

          public String getDay() {
                    this.day = ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyy"));
                    return day;
          }
}
