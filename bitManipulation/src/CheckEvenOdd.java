// find the number whether it is even or odd
public class CheckEvenOdd {
    public static String isEvenOrOdd(int n){
        if((n&1)==0){
            return "Even";
        }
        return "Odd";
    }

    public static void main(String[] args) {
        System.out.println(isEvenOrOdd(38));
    }
}
