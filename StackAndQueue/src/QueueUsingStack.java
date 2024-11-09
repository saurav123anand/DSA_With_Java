import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack;
    Stack<Integer> backup;
    // app1 -- >(push operation T.C -> O(2n))
//    public QueueUsingStack(){
//        this.stack=new Stack<>();
//        this.backup=new Stack<>();
//    }
//    public int add(int num){
//        while(!stack.isEmpty()){
//            backup.push(stack.pop());
//        }
//        stack.push(num);
//        while (!backup.isEmpty()){
//            stack.push(backup.pop());
//        }
//        return num;
//    }
//    public int top(){
//        return stack.peek();
//    }
//    public int poll(){
//        return stack.pop();
//    }

    // app2 -- >(push operation T.C -> O(1))
    public QueueUsingStack(){
        this.stack=new Stack<>();
        this.backup=new Stack<>();
    }
    public int add(int num){
       return stack.push(num);
    }
    public int top(){
        if (!backup.isEmpty()) return backup.peek();
        while(!stack.isEmpty()){
            backup.push(stack.pop());
        }
        return backup.peek();
    }
    public int poll(){
        if (!backup.isEmpty()) return backup.pop();
        while(!stack.isEmpty()){
            backup.push(stack.pop());
        }
        return backup.pop();
    }
}
