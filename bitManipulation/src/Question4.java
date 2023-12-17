// set the ith bit , it means if ith bit is 0 make it 1 and if it is 1 keep it 1 only.
public class Question4 {
    public static int setIthBit(int n,int i){
        return n | (1<<(i));
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(10,2));
    }
}
