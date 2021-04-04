import java.util.*;
public class FindMedianInArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9};

        System.out.println(find_median(arr));
    }

    public static int find_median(int[] v)
    {
        // Code here
        int ans=0;
        Arrays.sort(v);
        if(v.length%2==0){
            ans=(v[v.length/2-1]+v[v.length/2])/2;
        }else{
            ans=v[v.length/2];
        }
        return ans;
    }
}
