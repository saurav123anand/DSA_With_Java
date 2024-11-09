public class StackUsingArray {
    int[] arr;
    int top=-1;
    public StackUsingArray(int capacity){
        this.arr=new int[capacity];
    }
    public boolean isFull(){
        return top==arr.length-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int size(){
        return top+1;
    }
    public int push(int num) throws Exception {
        if (isFull()){
            throw new Exception("Stack is full");
        }
        arr[++top]=num;
        return num;
    }
    public int pop() throws Exception {
        if (isEmpty()) throw new Exception("Stack is empty");
        return arr[top--];
    }
    public int peek() throws Exception {
        if (top==-1) throw new Exception("Stack is empty");
        return arr[top];
    }
    public void print(){
        for (int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) throws Exception {
        StackUsingArray stackUsingArray=new StackUsingArray(3);
        stackUsingArray.push(1);
        stackUsingArray.push(2);
        stackUsingArray.push(3);
        stackUsingArray.pop();
        stackUsingArray.push(4);
        stackUsingArray.print();
        System.out.println();
        System.out.println(stackUsingArray.size());
        System.out.println(stackUsingArray.peek());
    }
}
