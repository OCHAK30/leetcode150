package leetcode.arraystring;

//TC: O(3n)
//SC: O(2n)
public class Candy {
    public static void main(String[] args) {
        int[] ratings = {60, 80, 100, 100, 100, 100, 100};
        System.out.println(candy(ratings));
    }

    public static int candy(int[] ratings) {
        int sum = 0;
        int n = ratings.length;

        int[] left = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            if(ratings[i] > ratings[i-1]){
                left[i] = left[i-1]+1;
            }else {
                left[i] = 1;
            }
        }

        int[] right = new int[n];
        right[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            if(ratings[i] > ratings[i+1]){
                right[i] = right[i+1]+1;
            }else {
                right[i] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            sum += Math.max(left[i], right[i]);
        }
        return sum;
    }
}
