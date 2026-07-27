class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int max=0;
        int i=0;
        int j=n-1;
        while(i<j){
            int height=Math.min(heights[i],heights[j]);
            int area=height*(j-i);
            max=Math.max(area,max);
        if(heights[i]<heights[j]){
                i++;
        }else{
                j--;
        }
        }
        return max;
    }
}
