public class QueueUsingLL {
    Node start;
    Node end;
    int size;
    public int push(int num){
        Node newNode=new Node(num);
        if (start==null){
            start=newNode;
            end=newNode;
        }
        else{
            end.next=newNode;
            end=newNode;
        }
        size++;
        return num;
    }
    public int pop(){
        if (start==null )throw new RuntimeException("queue is empty");
        int popped= start.val;
        start=start.next;
        if (start==null) end=null;
        size--;
        return popped;
    }
    public int peek(){
        return start.val;
    }
    public int size(){
        return  size;
    }
}
