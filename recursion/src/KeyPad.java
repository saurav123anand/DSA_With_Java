import java.util.ArrayList;

public class KeyPad {
    static void keypad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
              char ch=(char) ('a'+i);
              keypad(p+ch,up.substring(1));
        }

    }
    // returning arraylist
    static ArrayList<String> keypad2(String p, String up){
        ArrayList<String> ans=new ArrayList<>();
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }
        int digit=up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch=(char) ('a'+i);
            ans.addAll(keypad2(p+ch,up.substring(1)));
        }
        return ans;

    }
    public static void main(String[] args) {
//         keypad("","12");
        System.out.println(keypad2("","12"));
    }
}
