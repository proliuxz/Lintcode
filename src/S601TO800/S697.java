package S601TO800;

public class S697 {
    public boolean checkSumOfSquareNumbers(int num) {
        // write your code here
        int r = (int) Math.sqrt(num);
        int[] pows = new int[r + 1];
        for (int i = 0; i <= r; i++) {
            pows[i] = (int) Math.pow(i,2);
        }
        for (int i = 0; i <= r ; i++) {
            for (int j = 0; j <= r ; j++) {
                if (pows[i]+pows[j] == num)
                    return true;
            }
        }
        return false;
    }
}
