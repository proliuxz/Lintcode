package S1401TO1600;

public class S1415 {
    public int[] getProduct(int[] arr) {
        // Write your code here
        if(arr.length == 1)
            return new int[] {1};
        int[] result = new int[arr.length];
        result[0] = 1;

        for (int i = 1; i <arr.length ; i++) {
            result[i] = result[i-1] * arr[i-1];
        }

        int temp = 1;
        for (int i = arr.length-1; i >=0 ; i--) {
            result[i] *= temp;
            temp *= arr[i];
        }
        return result;
    }
}
