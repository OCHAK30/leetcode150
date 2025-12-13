package leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

//TC: O(log n), SC: O(log N)

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
       //approach 1
        Set<Integer> set = new HashSet<>();

        while(n != 1){
            if(set.contains(n)){
                return false;//came back to same number, we can never reach 1
            }else {
                set.add(n);
            }
            n = sumOfSqOfDigits(n);
        }
        return true;
    }

    public static int sumOfSqOfDigits(int n){
        int sum = 0;

        while(n != 0){
            int rem = n%10;
            sum += (rem*rem);
            n = n/10;
        }
        return sum;
    }
}
