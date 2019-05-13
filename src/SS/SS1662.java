package SS;

import java.util.Arrays;
import java.util.HashMap;

public class SS1662 {
    public int getAns(int[] a) {
        // write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], i);
        }
        Arrays.sort(a);
        int pos = (a.length - 1) / 2;
        return map.get(a[pos]);
    }

    public static void main(String[] args)
    {
        SS1662 s = new SS1662();
        int[] arr1 = {4,5,1,2,3};
        int[] arr2 = {7,9,4,5};
        System.out.println(s.getAns(arr1));
        System.out.println(s.getAns(arr2));
    }
}
