public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue customQueue=new CustomQueue(5);
//        customQueue.insert(5);
//        customQueue.insert(6);
//        customQueue.insert(7);
//        customQueue.insert(8);
//        customQueue.insert(9);
//        int removed=customQueue.remove();
//        customQueue.display();
//        System.out.println(removed);

        CircularQueue circularQueue=new CircularQueue(5);
        circularQueue.insert(5);
        circularQueue.insert(6);
        circularQueue.insert(7);
        circularQueue.insert(8);
        circularQueue.insert(9);
        circularQueue.display();
        int removed=circularQueue.remove();
        System.out.println(removed);
        circularQueue.insert(133);
        circularQueue.display();
    }
}
