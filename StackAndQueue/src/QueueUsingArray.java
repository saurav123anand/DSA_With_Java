public class QueueUsingArray {
    int[] arr;
    int start=-1;
    int end=-1;
    int currSize=0;
    public QueueUsingArray(int capacity){
        this.arr=new int[capacity];
    }
    public int push(int num) throws Exception {
        if (currSize==arr.length){
            throw new Exception("queue is full");
        }
        if (currSize==0) {
            start=0;
            end=0;
        }
        else{
            end=(end+1)%arr.length;
        }
        arr[end]=num;
        currSize++;
        return num;
    }
    public int pop() throws Exception {
        if (currSize==0) throw new Exception("queue is empty");
        int popped=arr[start];
        if (currSize==1){
            start=1;
            end=-1;
        }
        else{
            start=(start+1)%arr.length;
        }
        currSize--;
        return popped;

    }

}
