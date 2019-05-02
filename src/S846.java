import java.util.Arrays;
import java.util.Comparator;

public class S846 {
    public int[][] multiSort(int[][] array) {
        // Write your code here
        Arrays.sort(array, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o2[1] == o1[1] ? o1[0] - o2[0] : o2[1] - o1[1];
            }
        });
        return array;
    }

    public static void main(String[] args)
    {
        S846 s = new S846();
        int[][] array = new int[][] {{2,100},{1,100},{3,50}};
        int[][] res = s.multiSort(array);
        System.out.println(res[0][0]);
        System.out.println(res[0][1]);
        System.out.println(res[1][0]);
        System.out.println(res[1][1]);
        System.out.println(res[2][0]);
        System.out.println(res[2][1]);
    }
}
