import java.util.*;
public class TripletSum {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7};
        int sum=9;
        System.out.println("is there any triplet : "+find3Numbers(arr,arr.length,sum));
        
    }
    public static boolean find3Numbers(int A[], int n, int X) { 
        
        //SORT THE ARRAY
        Arrays.sort(A);

        //FIX ONE POINTER IN EACH ITERATION
        for(int i=0;i<n-2;i++){
            int l=i+1,r=n-1;

            //MOVE WITH TWO POINTERS LEFT AND RIGHT ACCORDINGLY
            while(l<r){
                if(A[i]+A[l]+A[r]==X){
                    return true;
                }else if(A[i]+A[l]+A[r]>X) r--;
                else l++;
            }
        }
        return false;
    
    }
}
