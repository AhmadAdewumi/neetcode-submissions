class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length < 0) return "";
        
        String prefix = strs[0];

        //-- check if the next word starts with our prefix
        //-- since we took the first word as smallest prefix
        //- the shorten as we go on if it didn't start with it
        for(int i = 1; i < strs.length; i++){
            while(!strs[i].startsWith(prefix) && prefix.length() > 0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}