import java.io.*;

public class ReArrangePositiveNegativeArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, -4, -1, 4 };
        rearrange(arr, arr.length);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]+" ");
    }

    static void rightRotate(int[] arr, int from, int to) {
        int temp = arr[to];
        for (int i = to; i > from; i--) {
            arr[i] = arr[i - 1];
            arr[from] = temp;
        }
    }

    static void rearrange(int[] arr, int n) {
        int wrongIndex = -1;
        for (int i = 0; i < n; i++) {
            if (wrongIndex != -1) {
                if ((arr[wrongIndex] >= 0 && arr[i] < 0) || (arr[wrongIndex] < 0 && arr[i] >= 0)) {
                    rightRotate(arr, wrongIndex, i);
                    if (i - wrongIndex >= 2)
                        wrongIndex += 2;
                    else
                        wrongIndex = -1;
                } else {
                    if ((arr[i] < 0 && i % 2 == 1) || (arr[i] >= 0 && i % 2 == 0))
                        wrongIndex = i;
                }
            }
        }
    }
}
