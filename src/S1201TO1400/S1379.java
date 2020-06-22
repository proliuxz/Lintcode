package S1201TO1400;

import java.util.Arrays;

public class S1379 {
    class Segment {
        public int start;
        public int end;

        public Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public int getLongestScene(String str) {
        Segment[] scene = new Segment[26];
        for (int i = 0; i < 26; i++)
            scene[i] = new Segment(str.length(), -1);

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            if (i < scene[index].start)
                scene[index].start = i;
            if (i > scene[index].end)
                scene[index].end = i;
        }

        Arrays.sort(scene, (a, b) -> a.start == b.start ? a.end - b.end : a.start - b.start);
        int res = scene[0].end - scene[0].start + 1;

        for (int i = 1; i < 26; i++) {
            if (scene[i].end == -1) {
                break;
            }
            if (scene[i].start <= scene[i - 1].end) {
                scene[i].start = scene[i - 1].start;
                if (scene[i - 1].end > scene[i].end)
                    scene[i].end = scene[i - 1].end;
            }
            if (scene[i].end - scene[i].start + 1 > res)
                res = scene[i].end - scene[i].start + 1;
        }
        return res;
    }
}
