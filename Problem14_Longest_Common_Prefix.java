// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

public class Problem14_Longest_Common_Prefix {
    public String name(String[] strs) {
        //check if the string are empty
        if(strs == null || strs.length == 0){
            return "";
        }
        //initialize prefix with initial string
        String prefix = strs[0];

        for(int i=1;i<strs.length;i++){
            //check if current string start with prefix
            while(strs[i].indexOf(prefix) != 0){
                //remove last character of prefix
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
