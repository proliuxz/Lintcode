package S601TO800;

public class S718 {
    public int repeatedString(String A, String B) {
        if (B.length() == 0) return 0;
        if (A.length() == 0) return -1;

        int i;
        StringBuilder S = new StringBuilder(A);
        for (i = 1; S.length() < B.length(); i++)
            S.append(A);
        if (S.indexOf(B) >= 0) return i;
        if (S.append(A).indexOf(B) >= 0) return i + 1;
        return -1;
    }
}
