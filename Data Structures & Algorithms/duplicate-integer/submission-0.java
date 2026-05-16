class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet notDup = new HashSet();

        for(int i=0 ; i < nums.length ; i++){
            if(notDup.contains(nums[i])){
                return true;
            }
            notDup.add(nums[i]);
        }

        return false;
    }
}