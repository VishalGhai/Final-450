import java.io.*;
public class MergeSortedArrays {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter first array elements : ");
            
            //Scanning First Array  Example : 1 3 5 7
            String s=br.readLine();
            String sarr1[]=s.split(" ");
            int arr1[] = new int[sarr1.length];
            for(int i=0;i<sarr1.length;i++){
            arr1[i]=Integer.parseInt(sarr1[i]);
            }

            //Scanning second Array   Example : 0 2 4 6
            System.out.println("Enter second array element: ");
            s=br.readLine();
            String sarr2[]=s.split(" ");
            int arr2[] = new int[sarr2.length];
            for(int i=0;i<sarr2.length;i++){
            arr2[i]=Integer.parseInt(sarr2[i]);
            }

            // i - starting index for arr1
            // j - starting index for arr2
            // m - length of arr1
            // n - length of arr2
            int i=0,j=0,m=arr1.length,n=arr2.length;
            
            //Declaring merged array
            int arr[]=new int[m+n];
            int k=0;
            while(i<m && j<n){
                if(arr1[i]<arr2[j]){
                    arr[k++]=arr1[i++];
                }else if(arr1[i]>arr2[j]){
                    arr[k++]=arr2[j++];
                }else{
                    arr[k++]=arr1[i++];
                    arr[k++]=arr2[j++];
                }
            }
            while(i<m){
                arr[k++]=arr1[i++];
            }
            while(j<n){
                arr[k++]=arr1[j++];
            }

            // Sorted merged array  -  0 1 2 3 4 5 6 7
            for (int a : arr) {
                System.out.print(a+" ");
            }

        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
