class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Input: nums = [1, 2, 3, 3, 4]
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }
}