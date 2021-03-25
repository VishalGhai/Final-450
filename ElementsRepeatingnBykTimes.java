import java.io.*;
import java.util.*;
class ElementsRepeatingnBykTimes{
    public static void main(String[] args) {
        int arr[] = new int[]{1,3,2,2,2,4,5,6,6,6};
        int N=arr.length,k=4;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : arr) {
            if(!map.containsKey(i)) map.put(i,0);
            map.put(i,map.get(i)+1);
            if(map.get(i)>N/k) System.out.println("Repeated element more than n/k times : "+i);
        }

    }
}