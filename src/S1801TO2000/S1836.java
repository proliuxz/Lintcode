package S1801TO2000;

public class S1836 {
    public boolean ReachingPoints(int[] start, int[] target) {
        if (start[0] == target[0] && start[1] == target[1])
            return true;
        if (start[0] > target[0] || start[1] > target[1])
            return false;
        return ReachingPoints(new int[] {start[0] + start[1], start[1]}, target) ||
                ReachingPoints(new int[] {start[0], start[0] + start[1]}, target);
    }
}
