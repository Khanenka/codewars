package org.khanenka;

public class BinaryAddition {

    public static String binaryAddition(int a, int b){
        int sum=a+b;
        System.out.println(Integer.toString(sum, 2));
        return Integer.toString(sum, 2);
    }
}
