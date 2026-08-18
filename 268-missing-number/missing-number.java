class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int arraysum = 0;
        for(int ele : nums){
            arraysum+=ele;
        }
        return sum-arraysum;
    }
}