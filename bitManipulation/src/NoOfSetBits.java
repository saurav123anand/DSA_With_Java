public class NoOfSetBits {

    public static int setBits(int n){
        int count=0;
//        while(n!=0){
//            count++;
//            n-=(n&(-n));
//        }

        //second way
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(setBits(45));
    }
}
