package S1601TO1800;

public class S1716 {
    public int minFlipsMonoIncr(String S) {
        int res = 0;
        if (S == null || S.isEmpty())
            return res;

        int onesCount = 0;
        for (char c : S.toCharArray()) {
            if (c == '1')
                onesCount++;
            else
                res++;
            res = Math.min(res, onesCount);
        }
        return res;
    }
}
