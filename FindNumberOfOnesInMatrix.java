public class FindNumberOfOnesInMatrix {
    public static void main(String[] args) {
        int mat[][] = new int[][]{
            {0,1,1,1},
            {0,0,1,1},
            {0,0,0,1},
            {1,1,1,1}
        };
        System.out.println("Max number of ones are in row : "+rowWithMax1s(mat,mat.length,mat[0].length));
    }

    static int rowWithMax1s(int mat[][], int R, int C) {
        int max_row_index = -1;
        int j = first(mat[0], 0, C - 1);
        if (j == 0) // if 1 is not present in first row
            return 0;
        if (j == -1) // if 1 is not present in first row
            j = C - 1;
        for (int i = 1; i < R; i++) {
            while (j >= 0 && mat[i][j] == 1) {
                j = j - 1; // Update the index of leftmost 1 seen so far
                max_row_index = i; // Update max_row_index
            }
        }
        return max_row_index;
    }

    static int first(int[] arr, int s, int e) {
        for (int i = s; i <= e; i++) {
            if (arr[i] == 1)
                return i;
        }
        return -1;
    }
}