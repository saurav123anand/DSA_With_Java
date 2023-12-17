public class SecondLargest {
//    static int secondLargest(int[]arr){
//       int largest=getLargest(arr);
//       int result=-1;
//       for(int i=0;i<arr.length;i++){
//           if(arr[i]!=arr[largest]){
//               if(result==-1){
//                   result=i;
//               }
//               else if(arr[i]>arr[result]){
//                   result=i;
//               }
//           }
//       }
//       return result;
//    }
//    static int getLargest(int [] arr){
//        int largest=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>arr[largest]){
//                largest=i;
//            }
//        }
//        return largest;
//    }


    //second way(efficient)

    static int secondLargest(int [] arr){
        int result=-1;
        int largest=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                result=largest;
                largest=i;
            }
            else if(arr[i]!=arr[largest]){
                if(result==-1 || arr[i]>arr[result]){
                    result=i;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
       int[] arr={10,5,8,20};
        System.out.println(secondLargest(arr));
    }
}
