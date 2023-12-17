package strings;

import java.util.ArrayList;

public class Q2 {
    // subsequence
//    static void subsequence(String processed,String unprocessed){
//        if(unprocessed.isEmpty()){
//            System.out.println(processed);
//            return;
//        }
//        char ch=unprocessed.charAt(0);
//        subsequence(processed+ch,unprocessed.substring(1));
//        subsequence(processed,unprocessed.substring(1));
//    }

    //REturing an arraylist
    static ArrayList<String> subsequence2(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> process=new ArrayList<>();
            process.add(processed);
            return process;
        }
        char ch=unprocessed.charAt(0);
        ArrayList<String> left=subsequence2(processed+ch,unprocessed.substring(1));
        ArrayList<String> right=subsequence2(processed,unprocessed.substring(1));
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
       // subsequence("","abc");
//       System.out.println(subsequence2("","abc"));
        System.out.println(subsequence2("","aabca"));
    }
}
