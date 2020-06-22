package S601TO800;

public class S656 {
    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null)
            return null;

        int len1 = num1.length();
        int len2 = num2.length();
        int[] res = new int[len1 + len2];

        for (int i = len1 - 1, j; i >= 0; i--) {
            int car = 0;
            for (j = len2 - 1; j >= 0; j--) {
                int pdt = car + res[i + j + 1] + (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                res[i + j + 1] = pdt % 10;
                car = pdt / 10;
            }
            res[i + j + 1] = car;
        }

        StringBuilder sb = new StringBuilder();
        for (int num: res)
            if(num != 0 || sb.length() != 0)
                sb.append(num);

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
