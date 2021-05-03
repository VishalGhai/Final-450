import java.util.*;
public class BalanceParanthesis {
    public static void main(String[] args) {
        String s="[{[]}]()(())";
        System.out.println("are paranthesis balanced : "+ispar(s));
    }
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> s=new Stack<Character>();
        int n=x.length();
        for(int i=0;i<n;i++){
            switch(x.charAt(i)){
                case '(':
                case '[':
                case '{':
                    s.push(x.charAt(i));
                    break;
                case ')':
                    if(!s.isEmpty()&&s.peek()=='(') s.pop();
                    else return false;
                    break;
                case ']':
                    if(!s.isEmpty()&&s.peek()=='[') s.pop();
                    else return false;
                    break;
                case '}':
                    if(!s.isEmpty()&&s.peek()=='{') s.pop();
                    else return false;
                    break;
            }
        }
        return s.isEmpty();
    }
}
