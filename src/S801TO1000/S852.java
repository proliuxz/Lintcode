package S801TO1000;

import java.util.ArrayList;
import java.util.List;

public class S852 {
    public List<String> ipToCIDR(String ip, int n) {
        // Write your code here
        long x = 0;
        String[] ips = ip.split("\\.");
        for (int i = 0; i < ips.length; ++i) {
            x = Integer.parseInt(ips[i]) + x * 256;
        }
        List<String> ans = new ArrayList<>();
        while (n > 0) {
            long step = x & -x;
            while (step > n) step /= 2;
            ans.add(longToIP(x, (int)step));
            x += step;
            n -= step;
        }
        return ans;
    }

    static String longToIP(long x, int step) {
        int[] ans = new int[4];
        ans[0] = (int) (x & 255);
        x >>= 8;
        ans[1] = (int) (x & 255);
        x >>= 8;
        ans[2] = (int) (x & 255);
        x >>= 8;
        ans[3] = (int) x;
        int len = 33;
        while (step > 0) {
            len --;
            step /= 2;
        }
        return ans[3] + "." + ans[2] + "." + ans[1] + "." + ans[0] + "/" + len;
    }
}
