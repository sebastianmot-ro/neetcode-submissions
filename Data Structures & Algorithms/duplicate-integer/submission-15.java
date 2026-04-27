class Solution {
    public boolean hasDuplicate(int[] nums) {
        //sortam vector si atunci daca apar duplicate sunt unul dupa altul
       Arrays.sort(nums);
       for (int i=1; i<nums.length; i++){
            if (nums[i] == nums[i-1]){
                return true;
            }
       }
       return false;
    }
}