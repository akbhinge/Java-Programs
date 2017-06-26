package ctci.ArraysandStrings;

import java.util.Scanner;

public class editsAway {

    private boolean checkEdits(String S1, String S2){

        if(Math.abs(S1.length() - S2.length()) > 1){
            return false;
        }

        int different = 0;
        if(S1.length() == S2.length()){
            for(int i=0; i< S1.length();i++) {
                    if (S1.charAt(i) != S2.charAt(i)) {
                        different++;
                    }
                }
            return different <= 1;
        }

        int counter = 0;

        if(S1.length()!=S2.length()) {
            for (int i = 0; i < S1.length(); i++) {
                for (int j = 0; j < S2.length(); j++) {
                    if (S1.charAt(i) != S2.charAt(j)) {
                        counter++;
                    }
                    return counter <= 1;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){

        editsAway ea1 = new editsAway();

        Scanner in  = new Scanner(System.in);

        String string1, string2;

        System.out.println("Enter the 1st and 2nd string: ");

        string1 = in.nextLine();

        string2 = in.nextLine();

        System.out.println("String 1: "+ string1);

        System.out.println("String 2: "+ string2);

        System.out.println();

        System.out.println(ea1.checkEdits(string1, string2));
    }
}
