// Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.


public class Problem9_Palindrome {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=x;
        int reverse=0;
        while(num>0){
            reverse = reverse *10 +num %10;
            num/=10;
        }
        return (x == reverse || x ==reverse/10);
    }
}
