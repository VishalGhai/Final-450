public class KthMaxInArray {
    public static void main(String[] args) {
        int arr[]=new int[]{36,986,56,76,16,96,7,657,56,456};
        int k=4;
        mergeSort(arr,0,arr.length-1);
        System.out.println(arr[k-1]);
    }

    static void mergeSort(int[] arr,int i,int j){
        if(i<j){
            int mid=(i+j)/2;
            mergeSort(arr,i,mid);
            mergeSort(arr,mid+1,j);
            merge(arr,i,mid,j);
        }
    }

    static void merge(int[] arr,int i,int mid,int j){
        int n1=mid-i+1;
        int n2=j-mid;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for (int k = 0; k < n1; k++) arr1[k]=arr[i+k];
        for (int k = 0; k < n2; k++) arr2[k]=arr[mid+1+k];
        int m=0,n=0;
        int k=i;
        while(m<n1&&n<n2){
            if(arr1[m]<=arr2[n]){
                arr[k]=arr1[m];
                m++;
            }else{
                arr[k]=arr2[n];
                n++;
            }k++;
        }
        while(m<n1){
            arr[k++]=arr1[m++];
        }
        while(n<n2){
            arr[k++]=arr2[n++];
        }
    }
}
