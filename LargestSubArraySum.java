public class LargestSubArraySum {
    public static void main(String[] args) {
        int arr[]=new int[]{-2,54,-3,2,-3,4,2,-34,35,53,-45,45,-45,2};
        int msf=0,meh=0;
        for (int i = 0; i < arr.length; i++) {
            meh += arr[i];
            if(meh < 0) meh =0;
            if(meh > msf) msf = meh;
        }
        System.out.println(msf);
    }
}
