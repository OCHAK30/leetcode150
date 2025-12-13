package leetcode.twopointer;

import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String[] str = s.split(" ");
        System.out.println(Arrays.toString(str));

        StringBuilder sb = new StringBuilder();

        for(String s1 : str){
            char[] ch = s1.toCharArray();
            System.out.println(Arrays.toString(ch));
            for(char c : ch){
                if(Character.isDigit(c) || Character.isAlphabetic(c)){
                    sb.append(c);
                }
            }
            //System.out.println(sb);
        }

        return checkPalindrome(sb.toString());
    }

    public static boolean checkPalindrome (String s){
        int start = 0, end = s.length()-1;

        while(start <= end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }

        return true;
    }
}
