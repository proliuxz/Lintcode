package S801TO1000;

public class S809 {
    public int kthGrammar(int N, int K) {
        return Integer.bitCount(K - 1) & 1;
    }
}
