package strings;

import java.util.ArrayList;

public class Q4 {
    //permutations
//    static  void permutation(String p,String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        char ch=up.charAt(0);
//        for (int i = 0; i <=p.length() ; i++) {
//             String f=p.substring(0,i);
//             String s=p.substring(i,p.length());
//             permutation(f+ch+s,up.substring(1));
//        }
//    }

    // returning an ArrayList
    static ArrayList<String> permutation(String p, String up){
        ArrayList<String> ans=new ArrayList<>();
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }
        char ch=up.charAt(0);

        for (int i = 0; i <=p.length() ; i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutation(f+ch+s,up.substring(1)));
        }
        return ans;
    }

    static int countPermutation(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch=up.charAt(0);
        int count=0;
        for (int i = 0; i <=p.length() ; i++) {
             String f=p.substring(0,i);
             String s=p.substring(i,p.length());
             count=count+countPermutation(f+ch+s,up.substring(1));
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(permutation("","abc"));
        System.out.println(countPermutation("","abc"));
    }
}
