package S1801TO2000;

public class S1836 {
    public boolean ReachingPoints(int[] start, int[] target) {
        while (start[0] <= target[0] && start[1] <= target[1]) {
            if (start[0] == target[0] && start[1] == target[1])
                return true;

            if (target[0] == target[1])
                return false;

            if (start[0] == target[0])
                return (target[1] - start[1]) % start[0] == 0;
            if (start[1] == target[1])
                return (target[0] - start[0]) % start[1] == 0;

            if (target[0] > target[1])
                target[0] = target[0] - target[1];
            else
                target[1] = target[1] - target[0];
        }

        return false;
    }
}
