class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int result = 0;
        int maxCount = 0;

        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            if(freqMap.get(num) > maxCount){
                result = num;
                maxCount = freqMap.get(num);
            }
        }

        return result;
    }
}