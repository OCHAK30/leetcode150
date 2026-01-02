package leetcode.arraystring;

//TC: O(n)
//SC: O(1)
//https://www.youtube.com/watch?v=IIqVFvKE6RY
public class CandyOptimal {
    public static void main(String[] args) {
        int[] ratings = {1,3,2,2,1};
        System.out.println(candy(ratings));
    }

    public static int candy(int[] ratings) {
        int sum = 1;
        int i = 1;
        int n = ratings.length;

        while(i < n){
            if(ratings[i] == ratings[i-1]){
                sum += 1;
                i++;
                continue;
            }
            int peak = 1;

            while(i<n && ratings[i] > ratings[i-1]){
                //increasing slope
                peak++;
                sum += peak;
                i++;
            }

            int down = 1;
            while(i<n && ratings[i] < ratings[i-1]){
                //decreasing slope
                sum += down;
                down++;
                i++;
            }

            if(down > peak){
                sum += down - peak;
            }
        }

        return sum;
    }
}
