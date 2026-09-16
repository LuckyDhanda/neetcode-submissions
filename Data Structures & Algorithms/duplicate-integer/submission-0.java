class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0; i<nums.length-1; i++){
            int curr = nums[i];
            for(int j = i+1; j<nums.length; j++){
                if(curr == nums[j]){
                    return true;
                }
            }
        }

        return false;
    }
}