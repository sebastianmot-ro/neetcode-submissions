class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (Integer i : nums){
            numsSet.add(i);
        }
       return numsSet.size() != nums.length ;
 }
}