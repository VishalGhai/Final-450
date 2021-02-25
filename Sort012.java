public class Sort012 {
    public static void main(String[] args) {
        int arr[]=new int[]{0,1,0,2,0,2,1};
        int l=0,m=0,h=arr.length-1;
        while(m<=h){
            if(arr[m]==0){
                int temp=arr[m];
                arr[m]=arr[l];
                arr[l]=temp;
                l++;m++;
            }else if(arr[m]==2){
                int temp=arr[m];
                arr[m]=arr[h];
                arr[h]=temp;
                h--;
            }else m++;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
