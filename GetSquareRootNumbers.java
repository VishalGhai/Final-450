class GetSquareRootNumbers {
    static int countSquares(int N) {
        // code here[]
        int i = 1, count = 0;
        while ((i * i) < N) {
            count++;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSquares(9));
    }
}