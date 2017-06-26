package javaCollections;


import java.util.Iterator;
import java.util.LinkedList;

public class javaIterators {

    public static void main(String[] args){
   LinkedList<String> animals = new LinkedList<>();

   animals.add("Dog");
   animals.add("Cat");
   animals.add("Penguin");

   Iterator<String> iterate1 = animals.iterator();

   while(iterate1.hasNext()) {
       String checkList = iterate1.next();

       System.out.println(checkList);
   }

   /* Using foreach loop

        for (String checkList : animals) {
            System.out.println(checkList);
        }

    */
   System.out.println();

   // Iterate through the linkedlist
   for(String animal: animals) {
       System.out.println(animal);
   }
    }
}
