package S001TO200;

import java.util.Arrays;

public class S172 {
    public int removeElement(int[] A, int elem) {
        // write your code here
        int i = 0;
        int pointer = A.length - 1;
        while(i <= pointer){
            if(A[i] == elem){
                A[i] = A[pointer];
                pointer--;
            } else {
                i++;
            }
        }
        return pointer + 1;
    }
}
