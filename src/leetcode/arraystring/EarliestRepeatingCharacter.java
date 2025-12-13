package leetcode.arraystring;

import java.util.HashMap;
import java.util.Map;
//Similar: https://www.geeksforgeeks.org/dsa/find-repeated-character-present-first-string/
public class EarliestRepeatingCharacter {
    public static void main(String[] args) {
        String s ="geeksforgeeks";
        System.out.println(firstRepChar(s));
    }

    public static String firstRepChar(String s) {
        // code here
        Map<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))) return Character.toString(s.charAt(i));
            else hm.put(s.charAt(i),1);
        }
        return "";
    }
}
