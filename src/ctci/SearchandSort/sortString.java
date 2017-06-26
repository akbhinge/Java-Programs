package ctci.SearchandSort;

import java.util.*;

public class sortString{

    private String sort(String s1){

        String[] cString = s1.split(" ");
        Arrays.sort(cString);
        return Arrays.toString(cString);
    }

    public static void main(String[] args){

        sortString ss1 = new sortString();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the string to sort: ");
        String s = in.nextLine();

        System.out.println("Original string: " + s);
        System.out.println();

        System.out.println("Sorted string: " +ss1.sort(s));
    }
}
