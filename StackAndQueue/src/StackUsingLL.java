class Node{
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next; }
}
public class StackUsingLL {
     Node top=null;
     int size=0;
     public int push(int num){
        Node newNode=new Node(num);
        newNode.next=top;
        top=newNode;
        size++;
        return num;
     }
     public int pop(){
         if (top==null){
             throw new RuntimeException("stack is empty");
         }
         int popped=top.val;
         top=top.next;
         size--;
         return popped;
     }
     public int top(){
         return top.val;
     }
}
