import S1001TO1200.S1185;
import S1801TO2000.S1808;

public class Main {
    public static void main(String[] args)
    {
        S1808 s = new S1808();
        int[] A = new int[] {2,1,2,4,2,2};
        int[] B = new int[] {5,2,6,2,3,2};
        int res = s.minDominoRotations(A, B);
        System.out.println(res);
    }
}
