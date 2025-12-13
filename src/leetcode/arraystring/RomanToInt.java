package leetcode.arraystring;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));;
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int sum = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if(hm.get(s.charAt(i)) < hm.get(s.charAt(i+1))){
                sum -= hm.get(s.charAt(i));
            }else {
                sum += hm.get(s.charAt(i));
            }
        }
        sum += hm.get(s.charAt(s.length()-1));

        return sum;
    }
}
