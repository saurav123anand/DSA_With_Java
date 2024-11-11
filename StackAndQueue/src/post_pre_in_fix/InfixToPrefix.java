package post_pre_in_fix;

import java.util.Stack;

public class InfixToPrefix {
    public static String convert(String infix){
        StringBuilder ans= new StringBuilder();
        StringBuilder infi= new StringBuilder(infix);
        infi=infi.reverse();
        for (int i = 0; i < infi.length(); i++) {
            if (infi.charAt(i)=='('){
                infi.setCharAt(i,')');
            }
            else if (infi.charAt(i)==')'){
                infi.setCharAt(i,'(');
            }
        }
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<infi.length();i++){
            char ch=infi.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                ans.append(ch);
            } else if (ch=='(') {
                stack.push(ch);
            } else if (ch==')') {
                while (!stack.isEmpty() && stack.peek()!='('){
                    ans.append(stack.pop());
                }
                stack.pop();
            }
            else{
                if (ch=='^'){
                    while(!stack.isEmpty() && priority(ch)<=priority(stack.peek())){
                        ans.append(stack.pop());
                    }
                }
                else{
                    while(!stack.isEmpty() && priority(ch)<priority(stack.peek())){
                        ans.append(stack.pop());
                    }
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()){
            ans.append(stack.pop());
        }
        ans=ans.reverse();
        return ans.toString();
    }
    private static int priority(char ch) {
        if (ch=='^') return 3;
        else if (ch=='*' || ch=='/') return 2;
        else if (ch=='+' || ch=='-') return 1;
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(convert("(A+B)*C-D+F"));
    }
}
