package leetcode.arraystring;

//TC: O(n) SC: O(1)
public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s,numRows));
    }

    public static String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder sb = new StringBuilder();
        int cycleLen = 2 * numRows - 2;
        int n = s.length();

        for (int row = 0; row < numRows; row++) {
            int i = row;
            boolean toggle = false;
            while(i < n){
                sb.append(s.charAt(i));
                //For the Middle Rows; jump1 = cycleLen - 2*row
                //jump2 = 2*row
                i += (row == 0 || row == numRows-1) ? cycleLen : toggle ? 2 * row : cycleLen - 2 * row;
                toggle = !toggle;
            }
        }
        return sb.toString();
    }
}
