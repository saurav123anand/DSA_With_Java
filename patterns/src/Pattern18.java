public class Pattern18 {
    static void pattern(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                char ch=(char)((n-j+1)+64);
                System.out.print(ch+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern(5);
    }
}
