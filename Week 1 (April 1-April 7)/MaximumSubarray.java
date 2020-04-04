class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum>=maxsum)
                    maxsum=sum;
            }
        }
        return maxsum;
    }
}