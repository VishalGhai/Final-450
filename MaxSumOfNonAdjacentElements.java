class MaxSumOfNonAdjacentElements {
    // Function to find the maximum money the thief can get.
    static int FindMaxSum(int arr[], int n) {
        // Your code here
        int incl = arr[0];
        int excl = 0;
        int excl_new;
        int i;

        for (i = 1; i < n; i++) {
            /* current max excluding i */
            excl_new = (incl > excl) ? incl : excl;

            /* current max including i */
            incl = excl + arr[i];
            excl = excl_new;
        }

        /* return max of incl and excl */
        return ((incl > excl) ? incl : excl);
    }

    public static void main(String[] args) {
        System.out.println(FindMaxSum(new int[] { 5, 5, 10, 100, 10, 5 }, 6));
    }
}