class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k = 0;
        int n = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                k++;
                n = Math.max(k,n);
            }
            else if(nums[i]==0){
                k=0;
            }
        }
        return n;
    }
}