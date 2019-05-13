package SS;

import java.util.LinkedList;
import java.util.Queue;

public class SS1683 {
    public int killMonster(int n, int[][] v) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 1; i < v.length; i++)
            queue.add(v[i]);
        boolean flag = false;
        int res = 0;
        int[] tmp;
        while (!flag) {
            flag = true;
            A: for (int i = 0; i < queue.size(); i++) {
                tmp = queue.poll();
                if(!canKill(v[0],tmp))
                {
                    queue.add(tmp);
                    continue A;
                }
                res++;
                v[0] = kill(v[0], tmp);
                flag = false;
            }
        }
        return res;
    }

    public boolean canKill(int[] a, int[] m)
    {
        boolean flag = true;
        for (int i = 0; i < 5 ; i++) {
            flag = (a[i] >= m[i]) && flag;
        }
        return flag;
    }

    public int[] kill(int[] a, int[] m)
    {
        int[] res = new int[5];
        for (int i = 0; i < 5 ; i++) {
            res[i] = a[i] + m[i];
        }
        return res;
    }
}
