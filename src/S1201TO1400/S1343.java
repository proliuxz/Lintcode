package S1201TO1400;

public class S1343 {
    public String SumofTwoStrings(String A, String B) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        int lenA = A.length();
        int lenB = B.length();
        int minLen = Math.min(lenA, lenB);
        if (lenA > lenB){
            sb.append(A.substring(0,lenA - minLen));
            A = A.substring(lenA - minLen);
        }
        else if (lenB > lenA)
        {
            sb.append(B.substring(0,lenB - minLen));
            B = B.substring(lenB - minLen);
        }
        sb.append(AddString(A, B, minLen));
        return sb.toString();
    }

    private String AddString(String a, String b, int len)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int av = a.charAt(i) - '0';
            int bv = b.charAt(i) - '0';
            sb.append(av + bv);
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        S1343 s = new S1343();
        String A = "99";
        String B = "111";
        System.out.println(s.SumofTwoStrings(A, B));
    }
}
