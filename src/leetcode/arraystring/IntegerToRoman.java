package leetcode.arraystring;

//TC: O(CharactersInString)
//SC:O(1)
public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 3749;
        System.out.println(intToRoman(num));
    }

    public static String intToRoman(int num) {
        String res = "";
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        for (int i = 0; i < values.length; i++) {
            while(num >= values[i]){
                res += roman[i];
                num -= values[i];
            }
        }

        return res;
    }
}
