package leetcode.arraystring;

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        int[] citations = {1,3,1};
        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int low = 0, high = n;
        int result = 0;

        while(low <= high) {
            int mid = low + (high-low)/2;
            int cnt = countCitations(mid,citations);

            if(cnt  >= mid){
                low = mid + 1;
                result = mid;
            }else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static int countCitations(int mid, int[] citations){
        int cnt = 0;

        for (int c : citations) {
            if(c >= mid) cnt++;
        }
        return cnt;
    }
}
