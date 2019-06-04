package S1401TO1600;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class S1408 {
    class Station {
        public int d;
        public int gas;
        public Station(int d, int gas) {
            this.d = d;
            this.gas = gas;
        }
    }

    public static Comparator<Station> gasComparator = new Comparator<Station>(){
        public int compare(Station a, Station b) {
            return b.gas - a.gas;
        }
    };
    public static Comparator<Station> dComparator = new Comparator<Station>(){
        public int compare(Station a, Station b) {
            return a.d - b.d;
        }
    };

    public int getTimes(int target, int original, int[] distance, int[] apply) {
        // Write your code here
        Queue<Station> q = new PriorityQueue<Station>(distance.length, gasComparator);
        Station[] s = new Station[distance.length];
        for(int i = 0; i < distance.length; i++) {
            s[i] = new Station(distance[i], apply[i]);
        }
        Arrays.sort(s, dComparator);
        int ans = 0;
        int i = 0;
        while(original < target && i < distance.length) {
            while(i < distance.length && original >= s[i].d) {
                q.offer(s[i]);
                i++;
            }
            Station now = q.poll();
            if(now == null) {
                break;
            }
            original += now.gas;
            ans++;
        }
        if(original >= target) {
            return ans;
        } else {
            return -1;
        }
    }
}
