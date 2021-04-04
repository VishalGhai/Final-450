public class CheckEveryElementIsPalindrome {
    public static void main(String[] args) {
        int arr[]=new int[]{111,222,333,444,555,121};
        System.out.println("Every element is palindrome : "+(palinArray(arr, arr.length)==1?true:false));
    }

    public static int palinArray(int[] a, int n) {
        // add code here.
        for (int i : a) {
            StringBuilder sb = new StringBuilder(String.valueOf(i));
            if (!sb.toString().equals(sb.reverse().toString())) {
                return 0;
            }
        }
        return 1;
    }
}
