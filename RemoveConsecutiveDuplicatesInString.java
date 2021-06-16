import java.util.*;

public class RemoveConsecutiveDuplicatesInString {
    static String removeConsecutiveCharacter(String s) {
        String S = "";
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (!st.isEmpty() && st.peek() != s.charAt(i)) {
                st.push(s.charAt(i));
            }
        }
        while (!st.isEmpty()) {
            S += st.pop();
        }
        return S;
    }

    public static void main(String[] args) {
        System.out.println(removeConsecutiveCharacter("aabbaabbaabba"));
    }
}