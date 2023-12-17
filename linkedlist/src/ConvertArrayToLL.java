class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
public class ConvertArrayToLL {
    static Node convert(int[]arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for (int i = 1; i <arr.length ; i++) {
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    // search in ll
    public static boolean search(Node head, int val){
        Node temp=head;
        while(temp!=null){
            if(temp.val==val){
                return true;
            }
            temp=temp.next;
        }
        return  false;
    }
    // remove tail
    public static Node removeTail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    // remove kth element from ll
    public static Node removeKth(Node head, int k){
        if(head==null){
            return head;
        }
        if(k==1){
            head=head.next;
            return head;
        }
        int count=0;
        Node prev=null;
        Node temp=head;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    // remove particular element from ll
    public static Node removeEl(Node head, int el){
        if(head==null){
            return head;
        }
        if(head.val==el){
            head=head.next;
            return head;
        }
        Node prev=null;
        Node temp=head;
        while(temp!=null){
            if(temp.val==el){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    // insert at last
    private Node insertLast(Node head, int val){
        Node node=new Node(val);
        if (head==null){
            return node;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        return head;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Node head=convert(arr);
        //System.out.println(head);
        //System.out.println(search(head,47));
        head=removeTail(head);
//        System.out.println(head);
        //head=removeKth(head,2);
        head=removeEl(head,3);
        System.out.println(head);
    }
}
