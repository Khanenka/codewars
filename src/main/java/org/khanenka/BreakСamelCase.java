package org.khanenka;

public class BreakСamelCase {
    public static String camelCase(String input) {

        String s=null;
        int count=0;
        int countSplit=0;

        char[] ch = input.toCharArray();

        for (char chh : ch) {

//            if (chh == ' ') {
//                countSplit++;
//
//            }
//            input.indexOf(" ")!=i
//            if (chh >= 'A' && chh <= 'Z' && countSplit != count && input.indexOf(chh)!=0) {
//
//                int i = input.indexOf(chh);
//                String substring = input.substring(0, i);
//
//                String substring1 = input.substring(i, input.length());
//
//                input = substring + " " + substring1;
//                System.out.println(input);
//            }

            if (chh >= 'A' && chh <= 'Z') {

                if(input.charAt(0)==' '){
                    System.out.println("xui");
                    int i = input.indexOf(chh);
if(i==0){

}


                    String substring = input.substring(0, i);
                    System.out.println("substring="+substring);
                    String substring1 = input.substring( i,input.length() );

                    input = substring + " " + substring1;

                }




            }

        }
//        System.out.println(count);
//        System.out.println(countSplit);
//        System.out.println(input);


        return input;
    }
}

