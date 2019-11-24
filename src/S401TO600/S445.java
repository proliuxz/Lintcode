package S401TO600;

public class S445 {
    public double cosineSimilarity(int[] A, int[] B) {
        // write your code here
        if (A.length != B.length)
            return 2;
        double s = 0;
        for (int i = 0; i < A.length; i++) {
            s += A[i] * B[i];
        }

        int dA = 0;
        for (int i = 0; i < A.length; i++) {
            dA += A[i] * A[i];
        }
        if (dA == 0) {
            return 2;
        }

        int dB = 0;
        for (int i = 0; i < A.length; i++) {
            dB += B[i] * B[i];
        }
        if (dB == 0) {
            return 2;
        }

        return s / Math.sqrt(dA) /Math.sqrt(dB);
    }
}
