class Solution {
    public int[] twoSum(int[] nums, int target) {
       //two pass HashMap
       Map<Integer, Integer> numMap = new HashMap<>();
            //nums[i], i
        for (int i=0; i<nums.length; i++){
            numMap.put(nums[i], i);
        }

        for (int i=0; i<nums.length; i++){
            int complement = target-nums[i];
            if (numMap.containsKey(complement) && i!=numMap.get(complement))
            return new int[]{i, numMap.get(complement)};
        }
        return new int[0];
    }
}
