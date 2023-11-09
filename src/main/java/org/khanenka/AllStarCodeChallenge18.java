package org.khanenka;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AllStarCodeChallenge18 {
    public static int strCount(String str, char letter) {
        int count = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.toCharArray().length; i++) {

            if (charArray[i] == letter) {
                count++;
            }
        }

       // System.out.println((int)str.chars().filter(x->x==letter).count());
        return count;
    }
}
