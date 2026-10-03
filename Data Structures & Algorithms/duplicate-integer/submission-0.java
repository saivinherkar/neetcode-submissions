class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Sort the array - log n 
        //Iterrate over array - nlogn
        Arrays.sort(nums);
        boolean flag = false;
        for(int i=0; i< nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                flag = true;
            }
        }
        return flag;
    }
}