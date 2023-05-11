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
