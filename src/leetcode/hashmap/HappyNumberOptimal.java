package leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;
//TC: O(log n), SC: O(1)
public class HappyNumberOptimal {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
       //approach 2 -> Tortoise and hare algo
        int slow = n , fast = n;

        while(true){
            slow = sumOfSqOfDigits(slow);
            fast = sumOfSqOfDigits(sumOfSqOfDigits(fast));
            if(fast == 1) return true;
            if(slow == fast) return false;
        }
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
