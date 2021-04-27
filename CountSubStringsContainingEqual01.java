public class CountSubStringsContainingEqual01 {
    public static void main(String[] args) {
        String str="0100110101";

        int count=0,countone=0,countzero=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0') countzero++;
            else if(str.charAt(i)=='1') countone++;
            if(countone==countzero) count++;
        }

        System.out.println(count);
    }
}
