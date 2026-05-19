class Solution {
    //-- Boyes Moore Voting Algorithm
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for(int num : nums){
            if(count == 0){ 
                candidate = num; //-- pick curr num as candidate
                count = 1; //-- set count
            }
            else if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }

        return candidate;
    }
}