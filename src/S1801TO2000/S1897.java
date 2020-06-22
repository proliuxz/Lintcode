package S1801TO2000;

public class S1897 {
    public boolean[] meetingRoomIII(int[][] intervals, int rooms, int[][] ask) {
        boolean[] res = new boolean[ask.length];
        int max = 0;
        for (int[] i: intervals)
            max = Math.max(max, i[1]);
        for (int[] i: ask)
            max = Math.max(max, i[1]);
        int[] array = new int[max + 1];

        for (int[] i: intervals) {
            array[i[0]]--;
            array[i[1]]++;
        }

        int[] cnt = new int[array.length + 1];
        for (int i = 1; i < cnt.length; i++) {
            rooms += array[i - 1];
            cnt[i] = cnt[i - 1] + (rooms == 0 ? 1 : 0);
        }
        for (int i = 0; i < ask.length; i++)
            res[i] = cnt[ask[i][0]] == cnt[ask[i][1]];
        return res;
    }
}
