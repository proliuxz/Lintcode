package S601TO800;

public class S643 {
    public int lengthLongestPath(String input) {
        String[] arr = input.split("\n");
        int[] max = new int[1];
        int[] cur = new int[1];
        while (cur[0] < arr.length) {
            dfs(arr, cur, max, 0, 0);
        }
        return max[0];
    }

    public void dfs(String[] arr, int[] cur, int[] max, int offset, int curLength) {
        if (cur[0] == arr.length) {
            return;
        }

        String curStr = arr[cur[0]++];
        if (curStr.contains(".")) {
            max[0] = Math.max(max[0], curLength + curStr.length());
            return;
        }

        while (cur[0] < arr.length && countOffset(arr[cur[0]]) == offset + 1) {
            dfs(arr, cur, max, offset + 1, curLength + curStr.length() - offset);
        }
    }
    public int countOffset(String s) {
        int count = 0;
        int i = 0;
        while (i < s.length() && s.charAt(i) == '\t') {
            count++;
            i++;
        }
        return count;
    }
}
