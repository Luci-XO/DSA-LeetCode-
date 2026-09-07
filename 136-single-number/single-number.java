class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int f=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    f++;
                    }
                }
                if(f==1){
                    return nums[i];
                }
            }
            return -1;
        }
    }