package leetcode.arraystring;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        //two pointers
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if(nums[i] == nums[j]){
                continue;
            }else {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}
