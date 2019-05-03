import java.util.Arrays;

public class S061 {
    public int[] searchRange(int[] A, int target) {
        // write your code here
        int res = Arrays.binarySearch(A, target);
        if (res<0)
            return new int[] {-1, -1};
        int left = res;
        int right = res;
        while (left - 1 >= 0 && A[left-1] == target)
            left--;
        while (right + 1 < A.length && A[right+1] == target )
            right++;
        return new int[] {left , right};
    }


    public static void main(String[] args)
    {
        int[] A = {1,2,3,3,3,3,3,3,4,5,6,7,7};
        S061 s = new S061();
        var x = s.searchRange(A, 10);
        System.out.println(x[0]);
        System.out.println(x[1]);
    }
}
