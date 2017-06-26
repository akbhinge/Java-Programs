package ctci.ArraysandStrings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class uniqueStrings {


    public static boolean isUnique(String S)
    {

        if(S.length() ==0){
            return false;
        }

        if(S.length() == 1){
            return true;
        }

        for(int i=0; i < S.length();i++)
        {

            char inputChar = S.charAt(i);
            int count=0;
            for(int j=i; j < S.length();j++)
            {
                if (inputChar==S.charAt(j))
                    count++;
            }
            if(count > 1)
                return false;
        }
        return true;
    }



    /*public static boolean isUnique(String S){

        if(S.length() ==0){
            return false;
        }

        if(S.length() == 1){
            return true;
        }

        char[] inputString = S.toCharArray();

        Set<Character> unique = new HashSet<>();

        for(int i=0; i< inputString.length; i++){

            unique.add(inputString[i]);

        }

        if(unique.size() != S.length()) {
            return false;
        }
        return true;
    }*/

    public static void main(String[] args){

        Scanner in  = new Scanner(System.in);

        String input;

        System.out.println("Enter the string: ");

        input = in.nextLine();

        System.out.println("Input string: "+ input);

        System.out.println();

        System.out.println("Is given string unique: ");

        System.out.println(isUnique(input));

        System.out.println();
    }
}
