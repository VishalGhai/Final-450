import java.io.*;
import java.util.*;
public class SumOfSubArrayEqualToZero {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int arr[] = new int[]{4,2,-3,1,6};

            System.out.println("Sum of any subarray is equal to zero : "+findsum(arr, arr.length));

        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    static boolean findsum(int arr[],int n)
    {
        //Your code here
        Set<Integer> hs = new HashSet<Integer>();
 
        // Initialize sum of elements
        int sum = 0;
 
        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) 
        {
            // Add current element to sum
            sum += arr[i];
 
            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash map
            if (arr[i] == 0
                || sum == 0
                || hs.contains(sum))
                return true;
 
            // Add sum to hash set
            hs.add(sum);
        }
 
        // We reach here only when there is
        // no subarray with 0 sum
        return false;
    }
}
