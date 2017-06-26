package javaCollections;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class javaSets {

    public static void main(String args[] ){

         /*  Sets- Hashset, treeset
         *
         *  sets don't contain duplicate values
         *  elements are not displayed in an order
         *
         *
          */
        Set<String> animalSet1 = new HashSet<String>();

        //LinkedHashSet- displays elements in order, contains doubly linkedlist

        Set<String> animalSet2  = new LinkedHashSet<String>();

        // TreeSet displays elements in sorted order
        Set<String> animalSet3  = new TreeSet<String>();


        animalSet1.add("Zebra");
        animalSet1.add("Lion");
        animalSet1.add("Python");
        animalSet1.add("Lion");
        System.out.println(animalSet1);

        animalSet2.add("Lion");
        animalSet2.add("Zebra");
        animalSet2.add("Python");
        System.out.println(animalSet2);

        animalSet3.add("Zebra");
        animalSet3.add("Lion");
        animalSet3.add("Python");
        animalSet3.add("Lion");
        System.out.println(animalSet3);

        //Iterate through a set
        for(String element: animalSet3){
            System.out.println(element);
        }

        // Sets are optimized to find the elements quickly
        //set.contains - used to check if element is present in a set
        // retainAll

    }

}

