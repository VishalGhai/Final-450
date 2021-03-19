import java.io.*;
import java.util.*;
public class CommonIn3SortedArrays {
    public static void main(String[] args) {
        int[] A = new int[]{1, 5, 10, 20, 40, 80};
        int[] B = new int[]{6, 7, 20, 80, 100};
        int[] C = new int[]{3, 4, 15, 20, 30, 70, 80, 120};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list=commonElements(A,B,C,A.length,B.length,C.length);
        for(int i:list){
            System.out.print(i+" ");
        }
    }
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        int i=0,j=0,k=0;
        HashSet<Integer> list=new HashSet<Integer>();
        while(i<n1&&j<n2&&k<n3){
        
            if(A[i]==B[j]&&B[j]==C[k]){ list.add(A[i]);i++;j++;k++;}
            else if (A[i] < B[j])
                i++;
            else if (B[j] < C[k])
                j++;
            else
                k++;
                
        }
        ArrayList<Integer> l=new ArrayList<Integer>(list);
        Collections.sort(l);
        return l;
    }
}
