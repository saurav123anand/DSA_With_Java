public class Pattern19 {
    static void pattern(int n){
        int space=0;
        for(int i=0;i<n;i++){
            //star
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            space+=2;
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<(2*n-2*i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern(5);
    }
}
