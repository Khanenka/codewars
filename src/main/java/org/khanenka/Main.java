package org.khanenka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //1
        System.out.println( ReverseWords.reverseWords("The greatest victory is that which requires no battle"));
        //2
        System.out.println(BinaryAddition.binaryAddition(5,9));
        //3
        System.out.println(Calculate.bmi(80,1.8));
        //4
        System.out.println(Arrays.toString(BeginnerLostWithoutAMap.map(new int[]{1, 2, 3})));
        //5
        System.out.println(AllStarCodeChallenge18.strCount("Hello", 'l'));
        //6
        System.out.println(CalculateAverage.find_average(new int[]{1,2,3}));
        //7
        System.out.println(PersistentBugger.persistence(999));
        //8
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");        System.out.println(SmileFaces.countSmileys(a));
        //9
        System.out.println(BreakСamelCase.camelCase(" camelCasing"));
    }
}