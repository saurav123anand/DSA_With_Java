// find nth magic number
public class Question5 {
    public static int findNthMagicNumber(int n){
        int ans=0;
        int power=1;
        while(n!=0){
            ans+=(n&1)*Math.pow(5,power);
            n=n>>1;
            power+=1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(findNthMagicNumber(1));
        System.out.println(findNthMagicNumber(2));
        System.out.println(findNthMagicNumber(3));
        System.out.println(findNthMagicNumber(4));
        System.out.println(findNthMagicNumber(5));
        System.out.println(findNthMagicNumber(6));
    }
}
