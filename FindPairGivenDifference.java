import java.util.*;

class FindPairGivenDifference {
    static boolean findPair(int arr[], int size, int n) {

        Arrays.sort(arr);

        int i = 0, j = 1;

        // Search for a pair
        while (i < size && j < size) {
            if (i != j && arr[j] - arr[i] == n) {

                return true;
            } else if (arr[j] - arr[i] < n)
                j++;
            else
                i++;
        }

        // System.out.print("No such pair");
        return false;
    }

    public static void main(String[] args) {

        findPair(new int[] { 5, 2, 4, 3, 7, 80, 2 }, 7, 78);
    }
}