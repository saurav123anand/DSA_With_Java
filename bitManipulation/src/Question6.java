// find the number of digits of a number in binary representation
public class Question6 {

    public static int noOfDigits(int n){
        return n&(-n);

    }
    public static void main(String[] args) {
        System.out.println(noOfDigits(20));
        System.out.println(101&1);
    }
}
