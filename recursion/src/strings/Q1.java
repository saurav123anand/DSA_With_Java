package strings;

public class Q1 {
    // skip the character
//    static void skip(String processed,String unprocessed){
//         if(unprocessed.equals("")){
//             System.out.println(processed);
//             return;
//         }
//         char ch=unprocessed.charAt(0);
//         if(ch=='a'){
//             //skip
//             skip(processed,unprocessed.substring(1));
//         }
//         else{
//             skip(processed+ch,unprocessed.substring(1));
//         }
//    }
    // returning a string (approach 2)
//    static String skip2(String unprocessed){
//        if(unprocessed.equals("")){
//            return "";
//        }
//        char ch=unprocessed.charAt(0);
//        if(ch=='a'){
//            //skip
//            return skip2(unprocessed.substring(1));
//        }
//        else{
//            return ch+skip2(unprocessed.substring(1));
//        }
//    }

    // remove the string (skip apple)
    static String skip3(String unprocessed){
        if(unprocessed.equals("")){
            return "";
        }
        if(unprocessed.startsWith("apple")){
            //skip
            return skip3(unprocessed.substring(5));
        }
        else{
            return unprocessed.charAt(0)+skip3(unprocessed.substring(1));
        }
    }

    public static void main(String[] args) {
       // skip("","baccad");
//        System.out.println(skip2("baccadh"));
        System.out.println(skip3("bdapplefg"));
    }
}
