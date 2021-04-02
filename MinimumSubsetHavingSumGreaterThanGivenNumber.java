public class MinimumSubsetHavingSumGreaterThanGivenNumber {
    public static void main(String[] args) {
        long array[]=new long[]{1, 4, 45, 6, 0, 19};

        System.out.println("Length of sub-array having sum greater than given number : "+sb(array, array.length, 51));
    }

    public static long sb(long a[], long n, long x) {
        // Your code goes here
        long currentSum=0,min_len=n+1;
        int start=0,end=0;
        
        while(end<n){
            while(currentSum<=x&&end<n){
                currentSum+=a[end++];
            }
            while(currentSum>x&&start<n){
                if(end-start<min_len){
                    min_len=end-start;
                }
                currentSum-=a[start++];
            }
        }
        return min_len;
    }
}
