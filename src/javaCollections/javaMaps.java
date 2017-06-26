package javaCollections;

import java.util.HashMap;
import java.util.Map;

public class javaMaps {

    public static void main(String args[]){


        Map<Integer, String> mapStart = new HashMap<>();

        mapStart.put(5,"Five");
        mapStart.put(10,"Ten");
        mapStart.put(2,"Two");
        mapStart.put(1,"One");

        String getText = mapStart.get(10);

        System.out.println(getText);

        for(Map.Entry<Integer,String> entry: mapStart.entrySet()){
            int key = entry.getKey();

            String value = entry.getValue();

            System.out.println(key + ":" + value);

        }


        Map<String,Integer> mapExample = new HashMap<String,Integer>();

        mapExample.put("Two",2);
        mapExample.put("Three",3);
        mapExample.put("One",1);

        for(String key: mapExample.keySet()){
            System.out.println(key + ":" + mapExample.get(key));
        }

    }
}
