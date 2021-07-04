class MergeArraysWithoutUsingExtraSpace {

    static void merge(int a[], int b[], int n, int m) {
        // code here
        int mx = 0;

        // Find maximum element of both array
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, a[i]);
        }

        for (int i = 0; i < m; i++) {
            mx = Math.max(mx, b[i]);
        }

        // Increment one two avoid collision of
        // 0 and maximum element of array in
        // modulo operation
        mx++;
        int i = 0, j = 0, k = 0;

        while (i < n && j < m && k < (n + m)) {

            // Recover back original element
            // to compare
            int e1 = a[i] % mx;
            int e2 = b[j] % mx;

            if (e1 <= e2) {

                // Update element by adding
                // multiplication with new number
                if (k < n)
                    a[k] += (e1 * mx);
                else
                    b[k - n] += (e1 * mx);

                i++;
                k++;
            } else {

                // Update element by adding
                // multiplication with new number
                if (k < n)
                    a[k] += (e2 * mx);
                else
                    b[k - n] += (e2 * mx);

                j++;
                k++;
            }
        }

        // Process those elements which are
        // left in array a
        while (i < n) {
            int el = a[i] % mx;
            if (k < n)
                a[k] += (el * mx);
            else
                b[k - n] += (el * mx);

            i++;
            k++;
        }

        // Process those elements which are
        // left in array a
        while (j < m) {
            int el = b[j] % mx;

            if (k < n)
                b[k] += (el * mx);
            else
                b[k - n] += (el * mx);

            j++;
            k++;
        }

        // Finally update elements by dividing
        // with maximum element
        for (int in = 0; in < n; in++)
            a[in] = a[in] / mx;

        // Finally update elements by dividing
        // with maximum element
        for (int in = 0; in < m; in++)
            b[in] = b[in] / mx;

        return;
    }

    public static void main(String[] args) {
        int a[] = new int[] { 1, 3, 5, 7 };
        int b[] = new int[] { 2, 4, 6, 8 };
        merge(a, b, 4, 4);

        for (int i : a)
            System.out.print(i + " ");
        for (int i : b)
            System.out.print(i + " ");
    }
}