public class MinimumJumpsToReachEnd {
    public static void main(String[] args) {
        int arr[]=new int[]{1,3,5,8,9,3,4,5,6,7};
        int max = arr[0];
        int step = arr[0];
        int jump = 1;
        if(arr.length==1) jump=0;
        else if(arr[0]==0) jump=-1;
        else
        for (int i = 1; i < arr.length; i++) {
            if(i==arr.length-1) break;
            max=Math.max(max,arr[i]+i);
            step--;
            if(step==0){
                jump++;
                if(i>=max){
                    jump=-1; break;
                }
                step=max-i;
            }
        }
        System.out.println("Minimum jumps required are : "+jump);
    }
}
