package S201TO400;

public class S383 {
    public int maxArea(int[] heights) {
        // write your code here
        int result = 0;
        result = Math.max(result, getArea(heights,0,heights.length-1));
        return result;
    }

    private int getArea(int[] heights, int l, int r)
    {
        if (l >= r)
            return -1;
        if (l + 1 == r)
            return Math.min(heights[l], heights[r]);
        if(heights[l]<heights[r])
            return Math.max(getArea(heights, l + 1, r),heights[l]*(r - l));
        else
            return Math.max(getArea(heights, l, r - 1),heights[r]*(r - l));
    }
}
