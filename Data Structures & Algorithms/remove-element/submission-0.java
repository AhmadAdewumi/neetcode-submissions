class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; //-- points to next pos. where a non value element should go


        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i]; //-- overwrite the non value element with value at i
                k++; //-- move forward
            }
        }

        return k;
    }
}