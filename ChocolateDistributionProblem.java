import java.util.*;
import java.io.*;
public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<Long>();
        list.add(1L);
        list.add(3L);
        list.add(4L);
        list.add(7L);
        list.add(9L);
        list.add(9L);
        list.add(52L);
        list.add(16L);
        long k=5;
        System.out.println("Minimum difference is : "+findMinDiff(list,(long)list.size(),k));
    }

    static long findMinDiff (ArrayList<Long> list, long n, long m)
    {
        // your code here
        if (m == 0 || n == 0)
            return 0;
      
        // Sort the given packets
        Collections.sort(list);
      
        // Number of students cannot be
        // more than number of packets
        if (n < m)
           return -1;
      
        // Largest number of chocolates
        Long min_diff = Long.MAX_VALUE;
      
        // Find the subarray of size m
        // such that difference between
        // last (maximum in case of
        // sorted) and first (minimum in
        // case of sorted) elements of
        // subarray is minimum.
         
        for (int i = 0; i + m - 1 < n; i++)
        {
            long diff = list.get(i+(int)m-1) - list.get(i);
            if (diff < min_diff)
                min_diff = diff;
        }
        return min_diff;
    }
}
