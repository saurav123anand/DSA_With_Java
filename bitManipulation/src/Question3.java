// find ith bit of a number  182
public class Question3 {
    public static int findIthBit(int n,int i){
       return (n&(1<<(i-1)))>>(i-1);
    }

    public static void main(String[] args) {
        System.out.println(findIthBit(13,2));
    }
}
