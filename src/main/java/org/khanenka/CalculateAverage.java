package org.khanenka;

public class CalculateAverage {

        public static double find_average(int[] array){
            double sum=0;
            double result = 0;
            for(int i=0;i<array.length;i++){
                sum+=array[i];
                result= sum/array.length;
            }

            return result;
        }

}
