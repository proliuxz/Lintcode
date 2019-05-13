package S401TO600;

public class S484 {
    public void swapIntegers(int[] A, int index1, int index2) {
        // write your code here
        int tmp = A[index1];
        A[index1] = A[index2];
        A[index2] = tmp;
    }
}
