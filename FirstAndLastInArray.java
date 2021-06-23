import java.util.*;

class FirstAndLastInArray {
    ArrayList<Long> find(long arr[], int n, int x) {
        // code here
        long first = -1;
        long last = -1;
        ArrayList<Long> res = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                last = (long) i;
                if (first == -1)
                    first = (long) i;
            }
        }
        res.add(first);
        res.add(last);
        return res;
    }
}