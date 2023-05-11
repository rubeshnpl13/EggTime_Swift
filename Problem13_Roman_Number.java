// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.

 

// Example 1:

// Input: s = "III"
// Output: 3
// Explanation: III = 3.

import java.util.*; 

public class Problem13_Roman_Number {
    public static int main(String s) {
        HashMap<String, Integer> roman = new HashMap<>();
        roman.put("I",1);
        roman.put("V",5);
        roman.put("X",10);
        roman.put("L",50);
        roman.put("C",100);
        roman.put("D",500);
        roman.put("M", 1000);

        int n = s.length();
        // Variable to store result. This is last character of string
        int num = roman.get(s.substring(n - 1));
        // Loop for each character from right to left
        for (int i = n - 2; i >= 0; i--) {
            // Check if the character at right of current character is greater or not
            //if greater add it to num else subtract from num
             if (roman.get(s.substring(i, i+1)) >= roman.get(s.substring(i + 1, i + 2))) {
                num += roman.get(s.substring(i, i+1));
            } else {
                num -= roman.get(s.substring(i, i+1));
            }
        }
        return num;    
    }
}
