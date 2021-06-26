public class FindMidOfThreeElements {

    static int middle(int A, int B, int C) {
        // code here
        int mid;
        if (A < B) {
            if (A < C) {
                if (B < C) {
                    mid = B;
                } else
                    mid = C;
            } else {
                mid = A;
            }
        } else if (A < C) {
            mid = A;
        } else {
            mid = B;
        }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println(middle(10, 5, 2));
    }
}