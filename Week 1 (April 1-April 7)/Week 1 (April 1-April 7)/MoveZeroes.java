class Solution {
    public void moveZeroes(int[] nums) {
        int position=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]==0)&&(i>=nums.length-position))
                break;
            if(nums[i]!=0)
                continue;
            position++;
            for(int j=i+1;j<nums.length;j++){
                nums[j-1]=nums[j];
            }
            nums[nums.length-position]=0;
            i--;
        }
    }
}