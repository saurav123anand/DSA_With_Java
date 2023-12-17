import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Student{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class ListNode1 {
      int val;
      ListNode1 next;
      ListNode1() {}
      ListNode1(int val) { this.val = val; }
      ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
  }
public class Demo2 {
    static ListNode1 convert(int[]arr){
        ListNode1 head=new ListNode1(arr[0]);
        ListNode1 mover=head;
        for (int i = 1; i <arr.length ; i++) {
            ListNode1 temp=new ListNode1(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static ListNode1 deleteDuplicates(ListNode1 head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode1 dummy=new ListNode1(0);
        dummy.next=head;
        ListNode1 prev=dummy;
        ListNode1 current=head;
        while(current!=null){
            while(current.next!=null && current.val==current.next.val){
                current=current.next;
            }
            if (prev.next==current){
                prev=prev.next;
            }
            else {
                prev.next=current.next;
            }
            current=current.next;
        }
        return dummy.next;
    }


    public static void main(String[] args) {
         int[] arr={1,1,1};
         ListNode1 head=convert(arr);
         System.out.println(deleteDuplicates(head).val);


    }
}
