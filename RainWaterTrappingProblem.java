import java.io.*;
public class RainWaterTrappingProblem {
    public static void main(String[] args) {
        int arr[]=new int[]{1,4,2,1,0,5,3,2,5};
        int waterCount=0,left=0,right=arr.length-1;
        int maxleft=arr[left],maxright=arr[right];
        while(left<right){
            if(arr[left]<arr[right]){
                left++;
                maxleft=Math.max(maxleft,arr[left]);
                waterCount+=maxleft-arr[left];
            }else{
                right--;
                maxright=Math.max(maxright,arr[right]);
                waterCount+=maxright-arr[right];
            }
        }
        System.out.println("Maximum water can be contained is : "+waterCount);
    }
}
