public class Main {
    public static void main(String[] args) {
//        LL list=new LL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertFirst(8);
//        list.insertLast(56);
//        list.insert(100,3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.find(3));

//        DLL list=new DLL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertFirst(8);
//        list.insertLast(99);
//        list.display();

        CLL cll=new CLL();
        cll.insertAfterTail(3);
        cll.insertAfterTail(4);
        cll.insertAfterTail(7);
        cll.delete(4);
        cll.display();
    }
}