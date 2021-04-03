public class ThreeWayPartition {
    public static void main(String[] args) {
        int arr[]=new int[]{76, 8, 75, 22, 59, 96, 30, 38, 36};
        threeWayPartition(arr,44,62);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    static public void threeWayPartition(int array[], int a, int b)
    {
        // code here 
        int l=0,m=0,h=array.length-1;
        while(m<=h){
            if(array[m]<a){
                int temp=array[m];
                array[m]=array[l];
                array[l]=temp;
                l++;m++;
            }else if(array[m]>b){
                int temp=array[m];
                array[m]=array[h];
                array[h]=temp;
                h--;
            }else m++;
        }
        // for(int i:array){
        //     System.out.print(i+" ");
        // }
    }
}
