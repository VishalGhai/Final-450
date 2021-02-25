public class ReverseArray{
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        int i=arr.length/2-1;
        int j=i+1;
        if(arr.length%2==1) j++;
        while(i>=0&&j<arr.length){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i--;
            j++;
        }
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }
}