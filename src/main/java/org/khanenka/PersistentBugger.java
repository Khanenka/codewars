package org.khanenka;

import java.util.stream.IntStream;

import static java.lang.Math.log10;


//Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
//
//        For example (Input --> Output):
//
//        39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
//        999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
//        4 --> 0 (because 4 is already a one-digit number)
public class PersistentBugger {


    public static int c = 0;

    public static int persistence(long n) {
//        int res1 = 0;
//        long res = 1;
//        char[] charArray = String.valueOf(n).toCharArray();
//        int size = (int) Math.ceil(log10(n));
//        for (int i = 0; i < size; i++) {
//            n = 1;
//
//            char c = charArray[i];
//
//            res = res * Long.parseLong(String.valueOf(charArray[i]));
//            n = res;
//
//
//        }
//
//
//        if (charArray.length == 1) {
//            res1 = c;
//        } else {
//            c++;
//            persistence(n);
//            res1 = c;
//        }
//
//
//        return res1; // your code

        int result = 0;
        while (n > 9) {
            long multi = 1;
            for (char t : String.valueOf(n).toCharArray()) {
                multi *= Long.parseLong(String.valueOf(t));
            }
            n = multi;
            result++;
        }
        return result;

    }


}
