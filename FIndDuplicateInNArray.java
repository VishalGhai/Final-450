public class FIndDuplicateInNArray {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,2};
        int sum1=0,sum2=0;
        for (int i = 0; i < arr.length; i++) {
            sum1+=arr[i];
            sum2+=i;
        }
        System.out.println(sum1-sum2);
    }    
}
