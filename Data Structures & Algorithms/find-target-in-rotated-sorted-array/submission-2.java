class Solution {
    public int search(int[] nums, int target) {
        //Rotate sorted array--> Half array is sorted.
        //Find the mid
        //check which part is sorted
        // Check for the target.

        int l = 0;
        int r = nums.length-1;

        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                return mid;
            }
//[1,2,3,7,0,14] 14
            if(nums[l]<=nums[mid]){
                if(target>nums[mid] || target<nums[l]){
                    l = mid+1;
                }else{
                    r = mid-1;
                }

            } else{
                if(target<nums[mid] || target>nums[r]){
                    r = mid-1;
                }else{
                    l = mid+1;
                }
            }
        }

return -1;
    }
}
