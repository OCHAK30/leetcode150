package leetcode.arraystring;

//TLE

public class IndexOfFirstOccurrenceBetter {
    public static void main(String[] args) {
        String haystack = "a", needle = "a";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()) return -1;

        for (int i = 0; i < haystack.length(); i++) {
            boolean flag = checkIndex(haystack.substring(i), needle);
            if(flag){
                return i;
            }
        }
        return -1;
    }

    public static boolean checkIndex(String s, String needle){
        if(s.length() < needle.length()) return false;
        int i = 0;

        for (int j = 0; j < needle.length(); j++) {
            if(s.charAt(i) == needle.charAt(j)) {
                i++;
            }else {
                return false;
            }
        }
        return true;
    }
}
