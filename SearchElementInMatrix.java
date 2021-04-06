import java.io.*;
import java.util.*;

public class SearchElementInMatrix {
    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        findRow(arr,arr.length,arr[0].length,7);
    }

    static void findRow(int[][] a, int n, int m, int k) {
        int l = 0, r = n - 1, mid;

        while (l <= r) {
            mid = (l + r) / 2;

            // we'll check the left and
            // right most elements
            // of the row here itself
            // for efficiency
            if (k == a[mid][0]) // checking leftmost element
            {
                System.out.println("Found at (" + mid + "," + "0)");
                return;
            }

            if (k == a[mid][m - 1]) // checking rightmost
                                    // element
            {
                int t = m - 1;
                System.out.println("Found at (" + mid + "," + t + ")");
                return;
            }

            if (k > a[mid][0] && k < a[mid][m - 1]) // this means the element
                                                    // must be within this row
            {
                binarySearch(a, n, m, k, mid); // we'll apply binary
                                               // search on this row
                return;
            }

            if (k < a[mid][0])
                r = mid - 1;
            if (k > a[mid][m - 1])
                l = mid + 1;
        }
    }

    static void binarySearch(int[][] a, int n, int m, int k, int x) // x is the row number
    {
        // now we simply have to apply binary search as we
        // did in a 1-D array, for the elements in row
        // number
        // x

        int l = 0, r = m - 1, mid;
        while (l <= r) {
            mid = (l + r) / 2;

            if (a[x][mid] == k) {
                System.out.println("Found at (" + x + "," + mid + ")");
                return;
            }

            if (a[x][mid] > k)
                r = mid - 1;
            if (a[x][mid] < k)
                l = mid + 1;
        }
        System.out.println("Element not found");
    }
}
