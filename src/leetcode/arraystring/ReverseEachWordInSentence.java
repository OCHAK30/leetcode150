package leetcode.arraystring;

import java.util.Arrays;
import java.util.Stack;

//https://www.geeksforgeeks.org/dsa/reverse-individual-words/
public class ReverseEachWordInSentence {
    public static void main(String[] args) {
        String s = "Geeks for Geeks";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                //insert into stack
                st.push(s.charAt(i));
            }else {
                while(!st.isEmpty()){
                    sb.append(st.pop());
                }
                sb.append(" ");
            }
        }

        //to fetch the last word if no space after that word
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.toString().trim();

    }
}
