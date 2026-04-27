class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
            //num[i] -> i
        for (int i=0; i<nums.length; i++){
            numMap.put(nums[i], i);
        } //the HashMap is filled with key-value pairs
        for (int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i){
                return new int[]{i,numMap.get(complement)};
            }
        }
        return new int[0];
    }
}
