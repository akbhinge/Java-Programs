package javaPracticeProgs;

import java.util.Scanner;

public class stringReverse {


    private static String strReverse(String s){

        char[] strArray=s.toCharArray();
        StringBuilder s1=new StringBuilder();


        for(int i=strArray.length-1;i>=0;i--){
            s1.append(strArray[i]);
        }

        return s1.toString();
    }

    private static String timeConversion(String s){
        if(s == null){
            return null;
        }

        String[] tempArray = s.split(":");
        String hours = tempArray[0];
        String minutes = tempArray[1];
        String seconds = tempArray[2].substring(0,2);
        String dayTime = tempArray[2].substring(2,4);
        String res;

        if(dayTime.equals("AM")){
            res = hours.equals("12")?"00":hours +":"+minutes+":"+seconds;
        }
        else{
            res = hours.equals("12")?hours: Integer.parseInt(hours)+12 +":"+minutes+":"+seconds;
        }
        return res;
    }


    public static void main(String[] args){

        System.out.println("String to reverse: ");

        Scanner in = new Scanner(System.in);
        String input= in.nextLine();

        System.out.println("String to reverse: ");
        System.out.println(input);

        System.out.println();

        System.out.println("Reversed string: "+ strReverse(input));

        String result = timeConversion(input);
        System.out.println("Time converted into 24 hour format: "+result);

    }
}
