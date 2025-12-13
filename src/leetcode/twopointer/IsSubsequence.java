package leetcode.twopointer;

import java.util.HashMap;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "acb";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t) {
        int j = 0;

        for (int i = 0; i < t.length(); i++) {
            if(s.charAt(j) == t.charAt(i)){
                j++;
            }
        }
        return (j==s.length());
    }
}
