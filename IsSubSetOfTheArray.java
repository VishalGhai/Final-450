import java.io.*;
import java.util.*;
public class IsSubSetOfTheArray {
    public static void main(String[] args) {
        long arr1[] = new long[]{11, 1, 13, 21, 3, 7};
        long arr2[] = new long[]{11, 1, 3, 7};

        System.out.println("Is arr2 a subset of arr1 : "+isSubset(arr1,arr2,arr1.length,arr2.length));

    }

    static String isSubset( long a1[], long a2[], long n, long m) {
        if(a2.length>a1.length) return "No";
        HashMap<Long,Long> map=new HashMap<Long,Long>();
        
        for(int i=0;i<a1.length;i++){
            if(!map.containsKey(a1[i])) map.put(a1[i],0L);
            map.put(a1[i],map.get(a1[i])+1);
        }
        for(int i=0;i<a2.length;i++){
            if(!map.containsKey(a2[i])) return "No";
            map.put(a2[i],map.get(a2[i])-1);
            if(map.get(a2[i])==-1) return "No";
        }
        return "Yes";
        
    }
}
