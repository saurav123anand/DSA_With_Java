package post_pre_in_fix;

import java.util.Stack;

public class PrefixToPostfix {
    // steps (reverse of postfix to prefix )
    // 1. if operand just put in the stack
    // 2. otherwise pop out first two element from stack and then do pop1pop2<operator> and put back in stack and at the end only one element will be in stack so just return that
    public static String convert(String prefix){
        Stack<String> stack=new Stack<>();
        for (int i=prefix.length()-1;i>=0;i--){
            char ch=prefix.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                stack.push(ch+"");
            }
            else{
                String pop1=stack.pop();
                String pop2=stack.pop();
                String val=pop1+pop2+ch;
                stack.push(val);
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        System.out.println(convert("/-AB*+DEF"));
    }
}
