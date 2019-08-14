package S1001TO1200;

import java.util.ArrayList;
import java.util.List;

public class S1064 {
    List<int[]> calendar;
    List<int[]> overlaps;
    public S1064() {
        calendar = new ArrayList<>();
        overlaps = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        if(overlaps.stream().anyMatch((int[] overlap)->overlap[0] < end && start < overlap[1]))
            return false;

        calendar.stream().forEach((int[] cal) -> {
            if (cal[0] < end && start < cal[1])
                overlaps.add(new int[]{Math.max(start, cal[0]), Math.min(end, cal[1])});
        });

        calendar.add(new int[]{ start, end });
        return true;
    }
}
