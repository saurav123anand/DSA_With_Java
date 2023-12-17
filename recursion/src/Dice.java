import java.util.ArrayList;

public class Dice {
    static  void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target ; i++) {
            dice(p+i,target-i);
        }
    }
    // returning an ArrayList
//    static ArrayList<String> dice2(String p, int target){
//        ArrayList<String> ans=new ArrayList<>();
//        if(target==0){
//            ans.add(p);
//            return ans;
//        }
//        for (int i = 1; i <=6 && i<=target ; i++) {
//            ans.addAll(dice2(p+i,target-i));
//        }
//        return ans;
//    }

    // custom number of faces
    static ArrayList<String> dice3(String p, int target,int face){
        ArrayList<String> ans=new ArrayList<>();
        if(target==0){
            ans.add(p);
            return ans;
        }
        for (int i = 1; i <=face && i<=target ; i++) {
            ans.addAll(dice3(p+i,target-i,4));
        }
        return ans;
    }
    public static void main(String[] args) {
//        dice("",4);
//        System.out.println(dice2("",4));
        System.out.println(dice3("",4,4));
    }
}
