public class MinimumSwapsAndKTogether {
    public static void main(String[] args) {
        int array[]=new int[]{2, 1, 5, 6, 3};
        System.out.println("Minimum number of swaps : "+minSwap(array,array.length,3));
    }

    public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=k) count++;
        }
        int bad=0;
        for(int i=0;i<count;i++){
            if(arr[i]>k) bad++;
        }
        int ans=bad;
        for(int i=0,j=count;j<n;++i,++j){
            if(arr[i]>k) --bad;
            if(arr[j]>k) ++bad;
            ans=Math.min(ans,bad);
        }
        return ans;
    }
}
