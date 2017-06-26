package javaPracticeProgs;

import java.util.Scanner;

public class stringPattern {

    private int getPcount(String s1, String s2){

        int count = 0;

        /*for(int i=1; i<s1.length();i++){
            for(int j=1; j < s2.length();j++){
                if(s1.charAt(i-1) == s2.charAt(j-1) || s2.charAt(j-1) == '*'){
                    count++;
                }
            }
        }*/
/*
        int index = s1.indexOf(s2);
        while(index !=-1 || s2.contains("*")){
            count++;
            s1 = s1.substring(index+1);
            index = s1.indexOf(s2);
        }
*/

        int lastIndex = 0;

        while(lastIndex !=-1){
            lastIndex = s1.indexOf(s2,lastIndex);

            if(lastIndex != -1){
                count++;
                lastIndex += s2.length();
            }
        }

        return count;
    }

    public static void main(String[] args){

        stringPattern sp1 = new stringPattern();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter strings lengths: ");
        int N = in.nextInt();

        System.out.println("Enter the string: ");

        String string1 = in.next();
        String replaced = string1.replaceAll("[^a-dA-D]","");
        if(string1.length() > N){
            System.out.println("Check string length");
        }

        System.out.println("Input string:" + replaced);
        System.out.println();
        System.out.println("Enter pattern length: ");
        int M = in.nextInt();

        if(M>N){
            System.out.println("Pattern length cannot be greater than string length ");
            M = in.nextInt();
        }
        System.out.println("Enter the pattern: ");
        String pattern1 = in.next();
        System.out.println("Pattern string:" + pattern1);
        if(pattern1.length() > M) {
            System.out.println("Check pattern length");
        }

        System.out.println();

        System.out.println("Pattern matches in positions: " + sp1.getPcount(string1, pattern1));

    }
}
