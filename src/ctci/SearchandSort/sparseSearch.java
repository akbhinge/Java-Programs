package ctci.SearchandSort;

import java.util.Scanner;

public class sparseSearch {


    public static int search(String[] strings, String target) {
        if (strings == null || strings.length == 0 || target == null)
            return -1;
        int start = 0;
        int end = strings.length - 1;
        while (start <= end) {
            while (start < end && strings[start].equals(""))
                start++;
            while (start < end && strings[end].equals(""))
                end--;
            int mid = (start + end) / 2;
            while (mid <= end && strings[mid].equals(""))
                mid++;
            if (strings[mid].equals(target))
                return mid;
            else if (strings[mid].compareTo(target) < 0) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        if (strings[start].equals(target))
            return start;
        return -1;
    }


    public static void main(String[] args){


        System.out.println("Enter no of elements in array");
        Scanner in  = new Scanner(System.in);

        int size = in.nextInt();

        String[] input = new String[size];

        System.out.println("Enter the strings: ");
        System.out.println();

        for(int i=0; i< input.length; i++){

            input[i] = in.nextLine();
        }


        System.out.println();
        System.out.println("String array: ");

        for(int i=0; i< input.length; i++){

            System.out.print(input[i]);
            System.out.print(",");
        }
    }

}
