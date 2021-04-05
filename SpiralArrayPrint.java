public class SpiralArrayPrint {
    public static void main(String[] args) {
        int arr[][]=new int[][]{{4,5,6,4},{7,8,9,7},{10,11,12,10}};
        int t=0,r=0,b=3,l=2;
        while(t<=b&&r<=l){
            for(int i=t;i<=b;i++){
                System.out.println(arr[r][i]);
            }
            for(int i=r+1;i<=l;i++){
                System.out.println(arr[i][b]);
            }
            for(int i=b-1;i>=t;i--){
                System.out.println(arr[l][i]);
            }
            for(int i=l-1;i>r;i--){
                System.out.println(arr[i][t]);
            }
            t++;
            r++;
            b--;
            l--;
        }
    }
}
