class Solution {
    public int[] twoSum(int[] nums, int target) {
        //HashMap double pass  
        //prima data salvez array-ul intr-un HashMap<nums[i], i> apoi parcurg fiecare element
        //din Map si verific daca complement = value, unde complement = target-nums[i]

        Map<Integer,Integer> numMap = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            numMap.put(nums[i], i);
        }
        for (int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && (numMap.get(complement)!= i) )
                return new int[]{i,numMap.get(complement)};
        }
        return new int[0];
    }
}
