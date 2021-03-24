import java.io.*;
import java.util.*;
public class FindLongestContinuousSubSequence {
    public static void main(String[] args) {
        try {
            int arr[] = new int[] { 1, 4, 2, 7, 2, 5, 3 };

            System.out.println("Longest continuous sub sequence is of length " +findLongestConseqSubseq(arr, arr.length));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    static int findLongestConseqSubseq(int arr[], int N) {
        // add your code here
        Set<Integer> set = new TreeSet<Integer>();

        for (int i : arr)
            set.add(i);

        // Iterator i=set.iterator();
        int flag = 0, count = 1, num = set.iterator().next(), max = 1;
        for (Integer i : set) {
            if (flag == 0) {
                flag = 1;
            } else {
                if (num + 1 == i) {
                    count++;
                    num++;
                    if (max < count)
                        max = count;
                } else {
                    num = i;
                    count = 1;
                }
            }
        }
        return max;

    }
}
