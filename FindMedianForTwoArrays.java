import java.util.*;
public class FindMedianForTwoArrays {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);

        System.out.println("Median of two arrays : "+findMedianSortedArrays(list1,list2));
    }

    public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        int m = a.size();
        int n = b.size();
        List<Integer> A = new ArrayList<Integer>();
        List<Integer> B = new ArrayList<Integer>();
        if (m > n) { // to ensure m<=n
            A = b;
            B = a;
            int tmp = m;
            m = n;
            n = tmp;
        } else {
            A = a;
            B = b;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B.get(j - 1) > A.get(i)) {
                iMin = i + 1; // i is too small
            } else if (i > iMin && A.get(i - 1) > B.get(j)) {
                iMax = i - 1; // i is too big
            } else { // i is perfect
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = B.get(j - 1);
                } else if (j == 0) {
                    maxLeft = A.get(i - 1);
                } else {
                    maxLeft = Math.max(A.get(i - 1), B.get(j - 1));
                }
                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }

                int minRight = 0;
                if (i == m) {
                    minRight = B.get(j);
                } else if (j == n) {
                    minRight = A.get(i);
                } else {
                    minRight = Math.min(B.get(j), A.get(i));
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}
