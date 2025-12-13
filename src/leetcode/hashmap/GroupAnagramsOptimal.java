package leetcode.hashmap;

import java.util.*;

/**
 * Time complexity: O(m * (n+26)) -> O(mn), where n is the length of the string being sorted
 * Space complexity: O(mn)
 */
public class GroupAnagramsOptimal {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];

            // Count frequency of each letter in the string
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int num : count) {
                sb.append(num);
                //System.out.println(sb);
            }
            String temp = sb.toString();

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
