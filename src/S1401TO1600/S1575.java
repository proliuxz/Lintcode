package S1401TO1600;

public class S1575 {
    public int getAnswer(int[] a) {
        // Write your code here
        int[] cnt = new int[4];
        for (int n: a
             ) {
            cnt[n - 1]++;
        }
        int cnt1 = cnt[0];
        int result = cnt[3] + cnt[2] + (cnt[1] + 1) / 2;
        cnt1 = cnt1 - cnt[2] - (cnt[1] % 2 == 0 ? 0 : 2);
        if (cnt1 > 0) {
            result += cnt1/ 4;
        }
        return result;
    }

    public static void main(String[] args)
    {
        S1575 s = new S1575();
        int res = s.getAnswer(new int[] {1,2,3,4});
        System.out.println(res);
    }
}
