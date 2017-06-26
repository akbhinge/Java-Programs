package javaCollections;

import java.util.*;

public class javaCollectionRevision {

    public static void main(String[] args){

        /*
            - remember what you want the collection to do
            - easier insertion/deletion/ retrieval and traversal


            - LISTS


            - duplicate elements are allowed
            - objects remain in order
            - iterating through a list is relatively fast
            - list can be sorted if required

            - SETS

            - store unique values
            - perfect to remove duplicate elements
            - elements are not indexed
            - faster to check if an element exists
            - implement hashCode() and equals() method to use own object

            - MAPS

            - consist of key value pairs
            - retrieving a value id fast, by key
            - iterating over map values is slow, over keys is relatively fast
            - maps are not optimized for iteration
            - to use own objects, have to implement hashCode() and equals() method
         */

            /*
             if order is not important, use Hashset
              */
            Set<String> set1 = new HashSet<>();

        /*
            - if you want elements to be sorted in natural order, use treeset
            - implement Comparable interface for custom type objects
         */
            Set<String> set2 = new TreeSet<>();

        /*
            If you want elements to remain in order as they were added
         */
            Set<String> set3 = new LinkedHashSet<>();

        /*
            - keys are not added in any particular order
         */
        Map<String, String>  map1 = new HashMap<String, String>();

        /*
            - keys are automatically sorted in order, implement Comparable for custom objects
         */
        Map<String, String> map2 = new TreeMap<String, String>();

        /*
            - keys remain in order they were added
         */
        Map<String, String> map3 = new LinkedHashMap<String, String>();
    }
}
