package leetcode.arraystring;

//TLE

public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        String haystack = "a", needle = "a";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        if(haystack.isEmpty() && needle.isEmpty()) return 0;
        if(haystack.length() < needle.length()) return -1;

        for (int i = 0; i < haystack.length(); i++) {
            for (int j = i; j < haystack.length(); j++) {
                boolean flag = checkIndex(haystack.substring(i,j+1), needle);
                if(flag){
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean checkIndex(String s, String needle){
        if(s.length() < needle.length()) return false;
        int idx = 0, i = 0;

        while(i < s.length()) {
            while(idx < needle.length() && s.charAt(i) == needle.charAt(idx)){
                idx++;
                i++;
            }
            if(idx == needle.length()) return true;
            else return false;
        }
        return false;
    }
}
