import java.io.*;
import java.util.*;
public class MergeIntervals {
    
    // Interval class containing start and end time of intervals
    static class Interval{
        int start=0;
        int end=0;
        Interval(int start, int end){
            this.start=start;
            this.end=end;
        }
    }
    public static void main(String[] args) {
        
        //List of intervals
        ArrayList<Interval> list = new ArrayList<Interval>();
        
        //Adding intervals
        list.add(new Interval(1,4));
        list.add(new Interval(5,8));
        list.add(new Interval(6,7));
        list.add(new Interval(2,6));
        list.add(new Interval(8,10));
        list.add(new Interval(1,2));
        
        //Calling function
        list=merge(list);
        
        //Printing list for merged intervals
        for (Interval i : list) {
            System.out.println(i.start+" "+i.end);
        }
    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals,new listcompare());
        
        for(int i=0;i<intervals.size()-1;i++){
            if(intervals.get(i+1).start>=intervals.get(i).start&&
            intervals.get(i+1).start<=intervals.get(i).end){
                if(intervals.get(i).end<intervals.get(i+1).end)
                intervals.get(i).end=intervals.get(i+1).end;
                intervals.remove(i+1);
                i--;
            }
        }
        
        return intervals;
    }

    //Custom comparator which srt intervals according to their starting time 
    static class listcompare implements Comparator<Interval>{
    public int compare(Interval a,Interval b){
        return a.start>b.start?1:-1;
    }
    }
}
