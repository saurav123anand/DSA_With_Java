import java.time.ZoneId;
import java.util.Arrays;
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

    public static int countCharacters(String[] words, String chars) {
        int count=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length();i++){
            map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0)+1);
        }
        for(int i=0;i<words.length;i++){
            boolean isBoolean=true;
            String word=words[i];
            for(int j=0;j<word.length();j++){
                if(!map.containsKey(word.charAt(j)) || map.get(word.charAt(j))==0){
                    isBoolean=false;
                    break;
                }
                // if(map.containsKey(word.charAt(j)) && )

            }
            if(isBoolean){
                for(int j=0;j<word.length();j++){
                    map.put(word.charAt(j),map.getOrDefault(word.charAt(j),0)-1);
                }
                count+=word.length();
            }
        }
        return count;
    }
    public static void main(String[] args) {
//        int[] arr={1,1,1,2,3};
//        ListNode head=convert(arr);
//        System.out.println(deleteDuplicates(head));

        String[] words={"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println(countCharacters(words,chars));


    }
}
