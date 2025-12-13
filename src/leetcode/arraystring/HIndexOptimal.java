package leetcode.arraystring;

import java.util.Arrays;

public class HIndexOptimal {
    public static void main(String[] args) {
        int[] citations = {1,3,1};
        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n+1];

        for(int c : citations){
            if(c >= n){
                count[n]++;//increment the last index only
            }else {
                count[c]++;
            }
        }

        //iterate from the last as me need max H index
        for (int i = n; i >= 0; i--) {
            if(count[i] >= i){
                return i;
            }
        }
        return 0;
    }

}
