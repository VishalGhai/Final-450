import java.util.Stack;

public class NumberOfReversalsToMakeParanthesisBalanced {
    public static void main(String[] args) {
        String s = "}{{}}{}{{";

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '}' && !stack.isEmpty()){
                if(stack.peek()=='{'){
                    stack.pop();
                }else stack.push(c);
            }else stack.push(c);
        }
        int count=0;
        int redlen = stack.size();
        while(!stack.isEmpty() && stack.peek()=='{'){
            stack.pop();
            count++;
        }
        System.out.println(redlen/2+count%2);
    }
}
