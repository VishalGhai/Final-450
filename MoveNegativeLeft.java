public class MoveNegativeLeft {
    public static void main(String[] args) {
        int arr[]=new int[]{3,-4,2,-4,4,3,2,-2,4};
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]>0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }else i++;
        }
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }
}
