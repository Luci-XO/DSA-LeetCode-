class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(nums.length==0){
            return 0;
        }
        int out = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[out]=nums[i];
                out++;
            }
            
        }
        return out;
    }
}