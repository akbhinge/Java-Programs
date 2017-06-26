package ctci.SearchandSort;

import java.util.*;

public class sortAnagram {

    private List<List<String>> getAnagram(String[] strs){

        if(strs == null){
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        Arrays.sort(strs);

        for (String temp : strs) {

            char[] ch = temp.toCharArray();
            Arrays.sort(ch);

            if (map.containsKey(String.valueOf(ch))) {
                map.get(String.valueOf(ch)).add(temp);
            } else {
                List<String> curString = new ArrayList<>();
                curString.add(temp);
                map.put(String.valueOf(ch), curString);
            }
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        sortAnagram sA1 = new sortAnagram();

        System.out.println("Enter size of string array: ");
        int size = in.nextInt();
        System.out.println("Enter strings: ");
        String[] input = new String[size];
        for(int i=0; i<size; i++){
            input[i] = in.next();
        }
        System.out.println("String array: ");
        System.out.print("[ ");
        for(int i=0; i<size;i++){
            System.out.print(input[i]+ " ");
        }
        System.out.print("]");

        System.out.println();
        System.out.println("Anagrams grouped together: ");
        System.out.println(sA1.getAnagram(input));
    }
}
