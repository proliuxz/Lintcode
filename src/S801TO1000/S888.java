package S801TO1000;

public class S888 {
    public boolean validWordSquare(String[] words) {
        // Write your code here
        int size = words.length;
        char[][] arr = new char[size][size];
        for (int i = 0; i < size; i++) {
            arr[i] = words[i].toCharArray();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i][j] != arr[j][i])
                    return false;
            }
        }
        return true;
    }
}
