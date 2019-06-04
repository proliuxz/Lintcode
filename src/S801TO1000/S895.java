package S801TO1000;

public class S895 {
    public int friendRequest(int[] ages) {
        // Write your code here
        int ans = 0;
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages.length; j++) {
                int A = ages[i], B = ages[j];
                if (i == j || B <= A / 2 + 7 || B > A || (B < 100 && A > 100)) {
                    continue;
                }
                ans++;
            }
        }
        return ans;
    }
}
