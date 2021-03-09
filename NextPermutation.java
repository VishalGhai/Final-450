import java.io.*;
import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            //Reading the array  -  4 2 1 3 6
            String s = br.readLine();
            String arr[] = s.split(" ");
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < arr.length; i++) {
                list.add(Integer.parseInt(arr[i]));
            }

            //c  -  count of decreasing elements from back
            int c = 0, i = 0, j = 0, k = 0;
            for (i = list.size() - 1; i > 0; i--) {
                if (list.get(i) < list.get(i - 1))
                c++;
                else
                break;
            }

            //i  -  index at which decreasing array condition break
            //j  -  index at which decreasing array condition break
            i = j = list.size() - c - 1;
            //k  -  index of greater element than i-1th from back
            k = list.size() - 1;
            for (; k >= j; k--)
                if (list.get(k) > list.get(i - 1))
                    break;
            
            //swap the i-1th and kth element
            swap(list, i - 1, k);

            //sort from j to last element
            Collections.sort(list.subList(j, list.size()));

            //resulted permutation next to the given one  -  4 2 1 6 3
            for (Integer in : list) {
                System.out.print(in+" ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void swap(ArrayList<Integer> A, int i, int j) {
        A.set(i, A.get(i) + A.get(j));
        A.set(j, A.get(i) - A.get(j));
        A.set(i, A.get(i) - A.get(j));
    }
}
