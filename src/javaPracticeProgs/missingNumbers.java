package javaPracticeProgs;

import java.util.*;

public class missingNumbers {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Arr1 size: ");
        int n = in.nextInt();
        System.out.println("Arr1 elements: ");
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = in.nextInt();
        }
        System.out.println("Arr2 size: ");
        int m = in.nextInt();
        System.out.println("Arr2 elements: ");
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = in.nextInt();
        }

        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();

        for(int val:arr1){
            if(map1.containsKey(val)){
                map1.put(val,map1.get(val)+1);
            }
            else{
                map1.put(val,1);
            }
        }

        for(int val:arr2){
            if(map2.containsKey(val)){
                map2.put(val,map2.get(val)+1);
            }
            else{
                map2.put(val,1);
            }
        }

        List<Integer> diff = new ArrayList<>();

        for(int i: map2.keySet()){
            if(map1.get(i) == null || map1.get(i) <map2.get(i)){
                diff.add(i);
            }
        }

        Integer[] res = new Integer[diff.size()];
        diff.toArray(res);
        Arrays.sort(res);
        System.out.println("Missing numbers are: ");
        for(int val :res){
            System.out.print(val +" ");
        }
    }
}
