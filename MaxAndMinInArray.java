public class MaxAndMinInArray {
    public static void main(String[] args) {
        int arr[]=new int[]{34,57,6767,65,787,5,64,6};
        int min,max;
        min=max=arr[0];
        for (int i : arr) {
            if(max<i) max=i;
            if(min>i) min=i;
        }
        System.out.println("Minimum and Maximum elements are : " + min +" and " + max);
    }
}