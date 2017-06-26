package javaPracticeProgs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class insertIntervals {

    public List<Interval> insertInto(List<Interval> intervals, Interval newInterval){

        List<Interval> res = new ArrayList<>();

        for(Interval i: intervals){

            if(newInterval == null || newInterval.start > i.end){
                res.add(i);
            }
            else if(i.start > newInterval.end){
                res.add(newInterval);
                res.add(i);
                newInterval = null;
            }
            else{
                newInterval.start = Math.min(newInterval.start, i.start);
                newInterval.end = Math.max(newInterval.end,i.end);
            }
            if(newInterval != null){
                res.add(newInterval);
            }
        }
        return res;
    }


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        insertIntervals is1 = new insertIntervals();

        List<Interval> inters = new ArrayList<>();

        inters.add(new Interval(1,2));
        inters.add(new Interval(3,5));
        inters.add(new Interval(6,7));
        inters.add(new Interval(8,10));
        inters.add(new Interval(12,16));

        Interval newInterval = new Interval(4,9);

        List<Interval> result = is1.insertInto(inters,newInterval);

        for(int i=0; i< result.size();i++){
            System.out.println(result.get(i).start +" " + result.get(i).end);
        }


    }
}


class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
}