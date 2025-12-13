package leetcode.arraystring;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int start = s.length()-1, end = s.length()-1;

        while(start >= 0){
            if(start >= 0 && s.charAt(start) == ' '){
                start--;
                continue;
            }
            end = start;
            while(start >= 0 && s.charAt(start) != ' '){
                start--;
            }
            sb.append(s.substring(start, end+1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
