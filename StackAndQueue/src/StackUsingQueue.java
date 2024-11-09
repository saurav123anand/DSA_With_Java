import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> queue;
    public StackUsingQueue(){
        queue=new LinkedList<>();
    }
    public int push(int num){
        int size=queue.size();
        queue.add(num);
        for (int i = 1; i <=size; i++) {
            queue.add(queue.poll());
        }
        return num;
    }
    public int pop(){
        return queue.poll();
    }
    public int top(){
        return queue.peek();
    }
}
