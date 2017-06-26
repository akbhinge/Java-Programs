package ctci.ArraysandStrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class isomorphicStrings {

    private boolean checkIsomorphic(String str1, String str2){

        if(str1 == null || str2 == null){
            return false;
        }

        if(str1.length() != str2.length()){
            return false;
        }

        Map<Character,Character> mapChar = new HashMap<>();

        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            char ch1 = str2.charAt(i);

            if(mapChar.containsKey(ch)){
                if(mapChar.get(ch)!= ch1){
                    return false;
                }
            }
            else{
                if(mapChar.containsValue(ch1)){
                    return false;
                }
            }
            mapChar.put(ch,ch1);
        }
        return true;
    }

    public static void main(String[]  args){

        Scanner in  = new Scanner(System.in);
        isomorphicStrings is1 = new isomorphicStrings();
        System.out.println("Enter 1st string: ");
        String s1 = in.next();
        System.out.println("1st string: " + s1);
        System.out.println("Enter 2nd string: ");
        String s2 = in.next();
        System.out.println("2nd string: " + s2);
        System.out.println();
        if(is1.checkIsomorphic(s1,s2)){
            System.out.println("Two strings are isomorphic");
        }
        else{
            System.out.println("Not isomorphic");
        }
    }
}