import java.io.*;
public class BuyingSellingStocksAtMostTwice {
    public static void main(String[] args) {
        int arr[] = new int[]{90, 80, 70, 60, 50};
        int minvalue=arr[1],minindex=1,maxProfitOneTime = 0;

        for(int i=2;i<arr.length;i++) {
            if(minvalue> arr[i]){
                minvalue=arr[i];
                minindex=i;
            } 
            else if(maxProfitOneTime < arr[i]-minvalue){
                maxProfitOneTime=arr[i]-minvalue;
            }
        }
        minvalue=arr[0];
        int maxProfitSecTime=0;
        for(int i=1;i<minindex;i++){
            if(minvalue> arr[i]){
                minvalue=arr[i];
                minindex=i;
            } 
            else if(maxProfitSecTime < arr[i]-minvalue){
                maxProfitSecTime=arr[i]-minvalue;
            }
        }
        System.out.println(maxProfitOneTime+maxProfitSecTime);
    }
}
