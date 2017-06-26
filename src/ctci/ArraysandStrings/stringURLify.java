package ctci.ArraysandStrings;

import java.util.Scanner;

public class stringURLify {



    public static String urlify(String s, int len){

        /*
        String addurl = "";

        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == ' '){
                addurl = addurl + "%20";
            }
            else
                addurl = addurl + s.charAt(i);
        }

        // assigning modified string back to original string
        s = addurl;

        return s; */

        char[] stringArray = s.toCharArray();

        int countSpaces = 0;

        for(int i=0; i< len;i++){
            if(stringArray[i] == ' '){
                countSpaces++;
            }
        }

        int newLength = len + (countSpaces*2)-1;

        for(int i= len-1  ; i>=0; i--){

            char c = stringArray[i];
            if(c == ' '){

                stringArray[newLength--] = '0';
                stringArray[newLength--] = '2';
                stringArray[newLength--] = '%';
            }
            else {
                stringArray[newLength--] = c;
            }
        }

        return new String(stringArray);
    }

    public static void main(String[] args){

        Scanner in  = new Scanner(System.in);

        String string1;

        System.out.println("Enter the string to urlify and its length: ");

        string1 = in.nextLine();
        int length = in.nextInt();

        System.out.println("Input string and length: "+ string1 + ", "+length);

        System.out.println();

        System.out.println("String after urlify: ");

        System.out.println(urlify(string1,length));

    }
}
