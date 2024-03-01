public class Q9 {
    // is array sorted
    static boolean isSorted(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<=arr[index+1] && isSorted(arr,index+1);
    }
    public static void main(String[] args) {
      int[] arr={3,3,4,11,13};
        System.out.println(isSorted(arr,0));
    }
}
