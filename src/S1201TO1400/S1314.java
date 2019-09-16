package S1201TO1400;

public class S1314 {
    public boolean isPowerOfTwo(int n) {
        // Write your code here
        if (n <= 0) {
            return false;
        }
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args){
        S1314 s = new S1314();
        var res = s.isPowerOfTwo(1);
        System.out.println(res);
    }
}
