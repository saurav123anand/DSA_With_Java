public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;
    public CustomStack(){
        this(DEFAULT_SIZE); // calling constructor inside constructor
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }
    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("Can't pop from an empty stack");
        }
        int removed=data[ptr];
        ptr--;
        return removed;
    }
    public int peek() throws StackException {
        if (isEmpty()){
            throw new StackException("Can't peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr==data.length-1; // ptr is at last index
    }
    public boolean isEmpty(){
        return ptr==-1;
    }

}
