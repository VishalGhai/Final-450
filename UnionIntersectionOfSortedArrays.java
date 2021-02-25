public class UnionIntersectionOfSortedArrays {
    public static void main(String[] args) {
        int arr1[]=new int[]{0,1,2,3,4,5,6};
        int arr2[]=new int[]{3,5};
        int i=0,j=0,k=0,l=0;
        int union[]=new int[arr1.length+arr2.length];
        int intersection[]=new int[arr1.length<arr2.length?arr1.length:arr2.length];
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                union[k++]=arr1[i];
                i++;
            }else if(arr1[i]==arr2[j]){
                union[k++]=arr1[i];
                intersection[l++]=arr1[i];
                i++;j++;
            }else if(arr1[i]>arr2[j]){
                union[k++]=arr2[j];
                j++;
            }
        }
        while(i<arr1.length){
            union[k++]=arr1[i++];
        }
        while(j<arr2.length){
            union[k++]=arr2[j++];
        }
        System.out.print("Union : ");
        for (int m : union) {
            System.out.print(m+" ");
        }
        System.out.print("Intersection : ");
        for (int m : intersection) {
            System.out.print(m+" ");
        }
    }
}
