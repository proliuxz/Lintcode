package S1001TO1200;

public class S1170 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        // write your code here
        if(r * c != nums.length * nums[0].length)
            return nums;

        int[][] res = new int[r][c];
        int ir = 0, ic = 0;
        for(int i = 0; i< nums.length; ++i) {
            for(int j = 0; j < nums[i].length; ++j) {
                res[ir][ic] = nums[i][j];
                ic++;

                if(ic == c) {
                    ic = 0;
                    ir++;
                }
            }
        }
        return res;
    }
}
