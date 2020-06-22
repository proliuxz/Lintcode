package S1201TO1400;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S1269 {
    public int gameTurns(List<Integer> to) {
        int n = to.size();
        int minTurn = n;
        for (int i = 0; i < n; i++) {
            int position = i;
            int turnCount = 0;
            Set<Integer> visited = new HashSet<>();
            position = to.get(position);
            turnCount++;
            while (position != i) {
                position = to.get(position);
                turnCount++;
                if (visited.contains(position))
                    break;
                visited.add(position);
            }
            if (position == i)
                minTurn = Math.min(minTurn, turnCount);
        }
        return minTurn;
    }
}
