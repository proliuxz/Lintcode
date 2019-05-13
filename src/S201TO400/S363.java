package S201TO400;

public class S363 {
    public int trapRainWater(int[] heights) {
        if(heights == null || heights.length == 0)
            return 0;
        int n = heights.length;
        // write your code here
        int[] left = new int[n];

        // Right [i] contains height of tallest bar to
        // the right of ith bar including itself
        int[] right = new int[n];

        // Initialize result
        int water = 0;

        // Fill left array
        left[0] = heights[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i-1], heights[i]);

        // Fill right array
        right[n-1] = heights[n-1];
        for (int i = n-2; i >= 0; i--)
            right[i] = Math.max(right[i+1], heights[i]);

        // Calculate the accumulated water element by element
        // consider the amount of water on i'th bar, the
        // amount of water accumulated on this particular
        // bar will be equal to min(left[i], right[i]) - arr[i] .
        for (int i = 0; i < n; i++)
            water += Math.min(left[i],right[i]) - heights[i];

        return water;
    }
}
