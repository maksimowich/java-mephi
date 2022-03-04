package ru.mephi.java.ex10;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {
   public static void main(String[] args) {
      int stringLength = new Scanner(System.in).nextInt();
      System.out.println(getRandomString(stringLength));
   }

   public static String getRandomString(int stringLength) {
      StringBuilder result = new StringBuilder();
      do {
         long randomLong = new Random().nextLong();
         result.append(Long.toString(Math.abs(randomLong), 36));
      } while (result.length() < stringLength);
      return result.substring(0, stringLength);
   }

}
