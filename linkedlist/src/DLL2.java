import com.sun.source.tree.BreakTree;

import java.awt.event.ItemEvent;

class Node2 {
    int val;
    Node2 next;
    Node2 back;

    public Node2(int val) {
        this.val = val;
    }

    public Node2(int val, Node2 next, Node2 back) {
        this.val = val;
        this.next = next;
        this.back=back;
    }
}
public class DLL2 {
    public  static  Node2 convertArrayToDLL(int[] arr){
        Node2 head=new Node2(arr[0]);
        Node2 prev=head;
        for (int i = 1; i < arr.length; i++) {
            Node2 temp=new Node2(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    public  static  Node2 deleteHead(Node2 head){
        if(head==null || head.next==null){
            return null;
        }
        Node2 prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;
        return head;
    }
    public  static  Node2 deleteTail(Node2 head){
        if(head==null || head.next==null){
            return null;
        }
        Node2 tail=head;
        while(tail.next!=null){
            tail=tail.next;

        }
        Node2 newTail=tail.back;
        tail.back=null;
        newTail.next=null;
        return head;
    }
    public  static  Node2 deleteKthNode(Node2 head,int k){
       int count=0;
       Node2 temp=head;
       while(temp!=null){
           count++;
           if(count==k){
               break;
           }
           temp=temp.next;
       }
       Node2 prev=temp.back;
       Node2 front=temp.next;
       if(prev==null && front==null){
           return null;
       }
       else if(prev==null){
           deleteHead(head);
       }
       else if(front==null){
           deleteTail(head);
       }
       else{
           prev.next=front;
           front.back=prev;
           temp.next=null;
           temp.back=null;
       }
       return head;
    }

    public  static  Node2 deleteNode(Node2 head,Node2 node){
        Node2 prev=node.back;
        Node2 front=node.next;
        if (front==null){
            prev.next=null;
        }
        else{
            prev.next=front;
            front.back=prev;
            node.next=null;
        }
        node.back=null;
        return head;
    }

    public  static  Node2 insertBeforeHead(Node2 head,int val){
       Node2 newHead=new Node2(val,head,null);
       head.back=newHead;
       head=newHead;
       return head;
    }
    public  static  Node2 insertBeforeTail(Node2 head,int val){
        if(head.next==null){
            insertBeforeHead(head,val);
        }
        Node2 tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        Node2 prev=tail.back;
        Node2 newNode=new Node2(val,tail,prev);
        prev.next=newNode;
        tail.back=newNode;
        return head;
    }
    public static Node2 insertBeforeKthElement(Node2 head,int k,int val){
        if(k==1){
            insertBeforeHead(head,val);
        }
        Node2 temp=head;
        int count=0;
        while(temp!=null){
            count++;
            if(count==k){
                break;
            }
            temp=temp.next;
        }
        Node2 prev=temp.back;
        Node2 newNode=new Node2(val,temp,prev);
        prev.next=newNode;
        temp.back=newNode;
        return head;
    }

    public static void insertBeforeNode(Node2 node,int val){
        Node2 prev=node.back;
        Node2 newNode=new Node2(val,node,prev);
        prev.next=newNode;
        node.back=newNode;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Node2 head=convertArrayToDLL(arr);
//        head=deleteHead(head);
//        head=deleteTail(head);
//        head=deleteKthNode(head,2);
//        head=deleteNode(head,head.next.next);
//        head=insertBeforeHead(head,9);
        head=insertBeforeTail(head,9);
        System.out.println(head);
    }
}
