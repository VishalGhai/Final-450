public class PermutationStrings {
    public static void main(String[] args) {
        String s="abc";
        rec(s,0,s.length()-1);
    }

    static void rec(String s,int start,int end) {
        if(start==end)
        System.out.println(s);
        else{
            for(int i=start; i<=end; i++){
                s=swap(s,start,i);
                rec(s,start+1,end);
                s=swap(s,start,i);
            }
        }
    }

    static String swap(String s,int i,int j){
        char[] arr=s.toCharArray();
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return String.valueOf(arr);
    }
}
