import java.io.*;
import java.math.*;
import java.util.*;
public class LargeNumberFactorial {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Eneter a number  : ");
            ArrayList<Integer> fact = factorial(Integer.valueOf(br.readLine()));
            
            System.out.print("Factorial is : ");
            for (Integer integer : fact) {
                System.out.print(integer);
            }
            System.out.print(" and length of factorial : "+fact.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static ArrayList<Integer> factorial(int N){
        //code here
        BigInteger b1=new BigInteger(String.valueOf(N));
        BigInteger b=new BigInteger(String.valueOf(N));
        
        while(N--!=1){
            BigInteger b2=b1.add(new BigInteger("-1"));
            // System.out.println("multiplying "+b1+" "+b2+" "+b);
            b=b.multiply(b2);
            b1=b2;
        }
        String s=String.valueOf(b);
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<s.length();i++){
            // System.out.println(s.charAt(i)+" ");
            list.add(Character.getNumericValue(s.charAt(i)));
        }
        return list;
    }
}
