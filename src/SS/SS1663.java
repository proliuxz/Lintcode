package SS;

import java.util.Arrays;

public class SS1663 {
    public String depress(int m, int k, int[] arr) {
        // Write your code here.
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < k; i++) {
            res += arr[i];
        }
        return res < m ? "yes" : "no";
    }

    public static void main(String[] args)
    {
        int[] arr = {5,1,1,2,3,1};
        SS1663 s = new SS1663();
        System.out.println(s.depress(3,3,arr));
    }
}
