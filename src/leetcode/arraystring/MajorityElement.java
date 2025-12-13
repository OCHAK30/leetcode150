package leetcode.arraystring;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,3,4};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums){
        int cnt = 0;
        int el = Integer.MAX_VALUE;

        for(int i=0; i < nums.length; i++) {
            if (cnt == 0) {
                el = nums[i];
                cnt++;
            } else if (el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }

        return -1;
    }
}
