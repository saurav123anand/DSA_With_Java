package strings;

import java.util.ArrayList;

public class Q3 {
    static ArrayList<String> subsequenceAscii(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> process=new ArrayList<>();
            process.add(processed);
            return process;
        }
        char ch=unprocessed.charAt(0);
        ArrayList<String> first=subsequenceAscii(processed+ch,unprocessed.substring(1));
        ArrayList<String> second=subsequenceAscii(processed,unprocessed.substring(1));
        ArrayList<String> third=subsequenceAscii(processed+(ch+0),unprocessed.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
    public static void main(String[] args) {
        System.out.println(subsequenceAscii("","abc"));
    }
}
