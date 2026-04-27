class Solution {
    public boolean hasDuplicate(int[] nums) {
        //HashSet (facem un Set nou, adaugam elementele din array in el si dupa aia
        //comparam .length de nums si .size de Set si daca difera atunci return true
        //(set nu permite duplicate)

        Set<Integer> set = new HashSet<>();
        for (int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        return (nums.length != set.size());
    }
}