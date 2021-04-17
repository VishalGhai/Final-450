public class isPalindrome {
    static int isPalindrome(String S) {
        // code here
        return (new StringBuilder(S)).reverse().toString().equals(S)?1:0;
    }
    public static void main(String[] args) {
        System.out.println("abba is palindrome : " + isPalindrome("abba"));
    }
}
