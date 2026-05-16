class Solution {
    public boolean isAnagram(String s, String t) {
       
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> sFreq = new HashMap();

        for(char c : s.toCharArray()){
            sFreq.put(c, sFreq.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> tFreq = new HashMap();
        for(char c : t.toCharArray()){
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }

        return sFreq.equals(tFreq);
    }
}
