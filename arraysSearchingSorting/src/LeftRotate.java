import java.util.*;

public class LeftRotate {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>>freqStringMap=new HashMap<>();
        for(String str:strs){
            String freqString=getFrequencyString(str); //
            // if the frequency string is present , add the string to the list
            if(freqStringMap.containsKey(freqString)){
                freqStringMap.get(freqString).add(str);
            }
            else{
                // create a new list
                List<String> strList=new ArrayList<>();
                strList.add(str);
                freqStringMap.put(freqString,strList);
            }
        }
        return new ArrayList<>(freqStringMap.values());
    }
    public static String getFrequencyString(String str){
        int[] count=new int[26];
        for(char ch:str.toCharArray()){
            count[ch-'a']++;
        }
        StringBuilder builder=new StringBuilder("");
        char ch='a';
        for(int i:count){
            builder.append(ch);
            builder.append(i);
            ch++;
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String[]arr={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(arr));
    }
}


