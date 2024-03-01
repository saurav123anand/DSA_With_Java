import java.util.HashMap;
import java.util.Map;

class ListNode {
     int val;
    ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Demo {
    static ListNode convert(int[]arr){
        ListNode head=new ListNode(arr[0]);
        ListNode mover=head;
        for (int i = 1; i <arr.length ; i++) {
            ListNode temp=new ListNode(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        ListNode prev=null;
        while(temp.next!=null){
            if(temp.val!=temp.next.val){
                prev=temp;
                temp=temp.next;
            }
            else{
                prev.next=temp.next.next;
                //prev=temp;
                temp=temp.next.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
//        int[] arr={1,1,1,2,3};
//        ListNode head=convert(arr);
//        System.out.println(deleteDuplicates(head));



    }
}
