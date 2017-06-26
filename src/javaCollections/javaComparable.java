package javaCollections;


import java.util.*;

class Person implements Comparable<Person>{

    private String pName;

    public Person(String pName){
        this.pName = pName;
    }

    public String toString(){
        return pName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return pName.equals(person.pName);
    }

    @Override
    public int hashCode() {
        return pName.hashCode();
    }

    @Override
    public int compareTo(Person person) {

        int len1 = pName.length();
        int len2 = person.pName.length();

        if(len1 > len2){
         return 1;
        }

        else if(len1 < len2){
            return -1;
        }
        else
            return pName.compareTo(person.pName);
    }
}


public class javaComparable {

    public static void main(String[] args ) {
        List<Person> list = new ArrayList<>();
        SortedSet<Person> set = new TreeSet<>();

        addElements(list);
        addElements(set);

        //Collections.sort(list);

        displayElements(list);
        System.out.println();

        //TreeSet displays element in sorted order
        displayElements(set);

    }

    private static void addElements(Collection<Person> col){
        col.add(new Person("James"));
        col.add(new Person("Mary"));
        col.add(new Person("Suzie"));
        col.add(new Person("Mike"));
    }


    //Person object doesn't have a natural order to display elements, use Comparable interface to implement it
    private static void displayElements(Collection<Person> col){

        for(Person element: col){
            System.out.println(element);
        }
    }
}

