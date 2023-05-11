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
