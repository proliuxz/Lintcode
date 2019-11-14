package S601TO800;

public class S757 {
    public int shortestUnorderedArray(int[] arr) {
        // write your code here
        int pre = -1;
        if (arr.length == 1) {
            return 0;
        }
        int ans = 1;
        int pos = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] < arr[i - 1]) {
                    ans = -1;
                    pos = i;
                    break;
                }
            }
        }
        for (int i = pos + 1; i < arr.length; i++) {
            if (ans == -1) {
                if(arr[i] > arr[i - 1]) {
                    return 3;
                }
            }
            else {
                if(arr[i] < arr[i - 1]) {
                    return 3;
                }
            }
        }
        return 0;
    }
}
