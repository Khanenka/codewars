package org.khanenka;

import java.util.*;
import java.util.stream.Collectors;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {


     int result= (int) arr.stream()
                .filter((p->p .equals( ":D")|| p.equals(":)") || p.equals(":-)")|| p.equals(":~)")|| p.equals(":-D")|| p.equals(":~D")|| p.equals(";D")|| p.equals(";)") || p.equals(";-)")|| p.equals(";~)")|| p.equals(";-D")|| p.equals(";~D")))
                .count();




        return result;
    }
}