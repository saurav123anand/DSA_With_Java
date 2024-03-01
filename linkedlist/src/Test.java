class ListNodeTest {
    public int value;
    public ListNodeTest next;

    public ListNodeTest(int value) {
        this.value = value;
    }

    public ListNodeTest(int value, ListNodeTest next) {
        this.value = value;
        this.next = next;
    }
}
public class Test {
    static ListNodeTest convert(int[]arr){
        ListNodeTest head=new ListNodeTest(arr[0]);
        ListNodeTest mover=head;
        for (int i = 1; i <arr.length ; i++) {
            ListNodeTest temp=new ListNodeTest(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static ListNodeTest deleteNode( ListNodeTest head, int pos) {
        // Write your code here
        if(pos==0){
            return head.next;
        }
        ListNodeTest temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        if(temp==null){
            return head;
        }
        temp.next=temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        int[] arr={74,65,82,27,24};
        ListNodeTest head=convert(arr);
        System.out.println(deleteNode(head,6).value);
    }
}
