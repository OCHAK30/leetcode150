package leetcode.hashmap;

import java.util.*;

/**
 * Time complexity: O(m * nlogn), where n is the length of the string being sorted
 * Space complexity: O(mn)
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);

            //map contains this string? If NO, then put temp and current string in a list
            if(!map.containsKey(temp)){
                map.put(temp,new ArrayList<>());
                //System.out.println(map);
            }
            map.get(temp).add(s);
            //System.out.println(map);
        }
        return new ArrayList<>(map.values());
    }
}
