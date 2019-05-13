package SS;

import java.util.Arrays;

public class SS1692 {
    public int getAns(int[] atk1, int[] atk2) {
        // Write your code here
        Arrays.sort(atk1);
        Arrays.sort(atk2);
        int len = atk1.length;
        int i = 0;
        int j = 0;
        int res = 0;
        for (; i < len && j< len ;) {
            if (atk1[i] > atk2[j])
            {
                res++;
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
        return res;
    }
}
