package S1201TO1400;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Work {
    Work(int diff, int prof)
    {
        this.diff = diff;
        this.prof = prof;
    }
    public int diff;
    public int prof;
}

public class S1392 {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int result = 0;
        if (profit == null || profit.length == 0)
            return 0;
        List<Work> works = new ArrayList<>();
        for (int i = 0; i < difficulty.length; i++) {
            works.add(new Work(difficulty[i], profit[i]));
        }
        Collections.sort(works, (Work w1, Work w2) -> w2.prof - w1.prof);
        for (int w: worker
             ) {
            for (Work work: works
                 ) {
                if (w >= work.diff)
                {
                    result += work.prof;
                    break;
                }
            }
        }
        return result;
    }
}
