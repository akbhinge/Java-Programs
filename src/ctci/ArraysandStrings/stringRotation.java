package ctci.ArraysandStrings;

import java.util.Scanner;

public class stringRotation {


    public static boolean checkRotation(String S1, String S2){

        if(S1.length() != S2.length()){
            return false;
        }
        if(S1.length() == 0 || S2.length() == 0){
            return false;
        }


        String concatenated = S2 + S2;

        //System.out.println("Concatenated string: "+ concatenated);

        if(isSubstring(concatenated,S1)){
            return true;
        }

        return false;
    }


    public static boolean isSubstring(String S1, String S2){

        if(S1.length() == S2.length()){
            if(S1.equals(S2)){
                return true;
            }
            return false;
        }

        if(S1.length() > S2.length()){
            if(S1.contains(S2)){
                return true;
            }
                return false;
        }


        if(S1.length() < S2.length()){
            if(S2.contains(S1)){
                return true;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args){

        Scanner in  = new Scanner(System.in);

        String string1, string2;

        System.out.println("Enter 1st and 2nd string: ");

        string1 = in.nextLine();

        string2 = in.nextLine();

        System.out.println("1st string: "+ string1);

        System.out.println("2nd string: "+ string2);

        System.out.println();

        System.out.println("Is string 2 rotation of string1- ");

        System.out.println(checkRotation(string1, string2));

    }
}
