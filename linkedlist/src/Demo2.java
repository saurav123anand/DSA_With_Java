import java.util.*;

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

    public static void main(String[] args) {}
}
