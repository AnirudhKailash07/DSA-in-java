class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int realsum = (n*(n+1))/2;
        int actualsum = 0;
        for(int i = 0; i < nums.length; i++) {
            actualsum = actualsum + nums[i];
        }
        int ans = realsum - actualsum;
        return ans;
    }
}

