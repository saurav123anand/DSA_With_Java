import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack= new Stack<>();
//        //adding
//        stack.push(5);
//        stack.push(6);
//        stack.push(7);
//        //removing
//        int deleted=stack.pop();
//        System.out.println(stack);
//        System.out.println(deleted);
//        System.out.println(stack.peek()); // gives the last element
//        System.out.println(stack);


        //Queue
        Queue<Integer> queue=new LinkedList<>();
        queue.add(5);
        queue.add(6);
        queue.add(7);

        System.out.println(queue);
        System.out.println(queue.peek());  // first element (i.e head of the queue)
        int removed= queue.remove();
        System.out.println(queue.remove()); // remove first element
        System.out.println(queue.poll());

        //Deque
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(59);
        deque.addFirst(78);
        deque.addLast(79);
        deque.add(67);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);



    }
}