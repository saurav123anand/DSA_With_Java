package post_pre_in_fix;

import java.util.Stack;

public class PostfixToPrefix {
    // steps
    // 1. if operand just put in the stack
    // 2. otherwise pop out first two element from stack and then do <operator>pop2pop1 and put back in stack and at the end only one element will be in stack so just return that
    public static String convert(String postfix){
        Stack<String> stack=new Stack<>();
        for (int i=0;i<postfix.length();i++){
            char ch=postfix.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                stack.push(ch+"");
            }
            else{
                String pop1=stack.pop();
                String pop2=stack.pop();
                String val=ch+pop2+pop1;
                stack.push(val);
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        System.out.println(convert("AB-DE+F*/"));
    }
}
