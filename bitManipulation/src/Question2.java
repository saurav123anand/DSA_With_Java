/* you are given an array of numbers and in that array every number appears twice ,only one number appears one,
you have to find that number */
public class Question2 {
    public static int findUniqueNumber(int [] arr){
        int unique=0;
        for(int num:arr){
            unique^=num;
        }
        return unique;
    }

    public static void main(String[] args) {
      int [] arr={2,3,4,1,2,1,3,6,4};
      System.out.println(findUniqueNumber(arr));
    }
}
