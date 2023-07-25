class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=0;
        int maximumsum=nums[0];
        for(int i=0;i<nums.length;i++){
            currentsum=currentsum+nums[i];
            if(currentsum>maximumsum) maximumsum=currentsum;
            if(currentsum<0) currentsum=0;
        }
        return maximumsum;
    }
}