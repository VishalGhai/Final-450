import java.io.*;
public class MaximumProductSubArray {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int arr[] = new int[]{6,-3,-10,0,2};

            System.out.println("Product of maximum product sub array is : "+maxProduct(arr,arr.length));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    static long maxProduct(int[] arr, int n) {
        // code here
        // for(int i=0;i<n;i++){
        //     arr[i]=Math.abs(arr[i]);
        // }
        long max=arr[0];
        long min=arr[0];
        long ans=arr[0];
        // long min=1,max=0;
        for(int i=1;i<n;i++){
            if(arr[i]<0){
                long temp=min;
                min=max;
                max=temp;
            }
            min=Math.min(arr[i],arr[i]*min);
            max=Math.max(arr[i],arr[i]*max);
            ans=Math.max(ans,max);
        }
        return ans;
    }
}
