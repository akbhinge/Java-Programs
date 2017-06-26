package javaCollections;

import java.util.*;

public class javaLists {

    public static void main(String[] args){

        ArrayList<Integer>  arr1 = new ArrayList<Integer>();

        arr1.add(1);
        arr1.add(43);

        for(Integer values: arr1) {
            System.out.println(values);
        }

        arr1.remove(1);
        System.out.println(arr1);

        LinkedList<Integer> linked1 = new LinkedList<Integer>();
        getTimings("Arraylist",arr1);
        getTimings("LinkedList", linked1);

    }

    private static void getTimings(String type, List<Integer> list){
        for(int i=0; i< 1E5;i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();

        /*adding items at end of list
        for(int i=0; i< 1E5;i++){
            list.add(i);
        }*/

        //adding items anywhere in list
        for(int i=0; i< 1E5;i++){
            list.add( list.size()-1,i);
        }

        long end = System.currentTimeMillis();

        System.out.println("time taken: " +(end-start) + " for " + type);
    }

}
