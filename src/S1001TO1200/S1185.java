package S1001TO1200;

public class S1185 {
    public String complexNumberMultiply(String a, String b) {
        // Write your code here
        int[] num1 = getValues(a);
        int[] num2 = getValues(b);
        int r = num1[0] * num2[0] - num1[1] * num2[1];
        int v = num1[0] * num2[1] + num1[1] * num2[0];
        StringBuilder sb = new StringBuilder();
        sb.append(r);
        sb.append("+");
        sb.append(v);
        sb.append("i");
        return sb.toString();
    }

    private int[] getValues(String s) {
        String[] vals = s.split("\\+");
        int r = Integer.valueOf(vals[0]);
        int v = Integer.valueOf(vals[1].split("i")[0]);
        return new int[]{r, v};
    }
}
