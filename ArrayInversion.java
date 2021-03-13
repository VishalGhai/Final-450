import java.io.*;
public class ArrayInversion {
    public static void main(String[] args) {
        long arr[]=new long[]{2,4,1,3,5};
        System.out.println(inversionCount(arr,arr.length));
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        long count=0;
            int n=arr.length;
        while(n--!=0){
            int i=n;
            while(i!=-1){
                if(arr[i]>arr[n])
                count++;
                i--;
            }
        }
        return count;
    }
}
