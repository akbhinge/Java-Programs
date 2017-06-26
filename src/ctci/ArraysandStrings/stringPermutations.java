package ctci.ArraysandStrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class stringPermutations {

    private boolean checkPermutation(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }

        Map<Character,Integer> match = new HashMap<>();

        for(int i=0; i< s1.length();i++){
            char ch1 = s1.charAt(i);

            if(match.containsKey(ch1)){
                match.put(ch1,match.get(ch1)+1);
            }
            else{
                match.put(ch1,1);
            }
        }

        for(int i=0; i<s2.length();i++){
            char ch2= s2.charAt(i);

            if(!match.containsKey(ch2)){
                return false;
            }
            else{
                int charCount = match.get(ch2);
                match.put(ch2,charCount-1);

                // if string 2 consists of an extra letter
                if(charCount ==0){
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args){

        stringPermutations sp1 = new stringPermutations();
        Scanner in  = new Scanner(System.in);

        String string1, string2;

        System.out.println("Enter 1st and 2nd string: ");

        string1 = in.nextLine();

        string2 = in.nextLine();

        System.out.println("1st string: "+ string1);

        System.out.println("2nd string: "+ string2);

        System.out.println();

        System.out.println("Are given strings permutations of each other: ");

        System.out.println(sp1.checkPermutation(string1, string2));

    }
}
