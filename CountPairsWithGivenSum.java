import java.io.*;
import java.util.*;
public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int arr[]=new int[]{1, 5, 7, 1};
        int sum=6;

        System.out.println("Number of pairs having sum equal to " +sum+" is : "+getPairsCount(arr,arr.length,sum));       // 2 in this example
    }
    static int getPairsCount(int[] arr, int n, int k) {
        // code here
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
            else map.put(arr[i],1);
        }
        int count=0;
        // for(int i:map.keySet()){
        // }
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(k-arr[i])){
            // System.out.println(i+" : "+map.get(i)+" and "+(k-i)+" : "+map.get(k-i)+" and count is : "+count);
                count+=map.get(k-arr[i]);
            }
            if(arr[i]==k-arr[i])
            count--;
        }
        return count/2;
    }
}
