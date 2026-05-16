class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seenNumbers = new HashMap();

        for(int i = 0; i < nums.length; i++){
            int neededNumber = target - nums[i];
             if(seenNumbers.containsKey(neededNumber)){
                return new int[]{
                    seenNumbers.get(neededNumber), i
                };
            }
            seenNumbers.put(nums[i], i);
        }
        return null;
    }
}
