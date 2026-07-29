class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int []res=new int[nums.length-k+1];
        int r=0;
        for(int i=0;i<=nums.length-k;i++){
            int max=nums[i];
            for(int j=i;j<i+k;j++){
                if(nums[j]>max){
                    max=nums[j];
                }
            }
            res[r++]=max;
        }
        return res;
    }
}
