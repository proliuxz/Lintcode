package SS;

import java.util.LinkedList;
import java.util.Queue;

public class SS1680 {
    public int getApplicant(int[] r, int[] d, int[] s, int[] t) {
        // Write your code here.
        Queue<Order> queue = new LinkedList<>();
        for (int i = 0; i <d.length ; i++) {
            queue.add(new Order(i+1, s[i], t[i], d[i]));
        }
        while (!queue.isEmpty())
        {
            Order o = queue.poll();
            for (int i = o.start - 1; i <o.end - 1 ; i++) {
                r[i] -= o.day;
                if (r[i]<0)
                    return o.id;
            }
        }
        return 0;
    }

    public static void main(String[] args)
    {
        int[] r = new int[] {42323424,633675939,990396626,965164370,965164370,965164370,972489810,619351082,619351082,0};
        int[] d = new int[] {586780256,316471206,42323424,8081621,36667522,110729,4572259,7436169,3834281,8646496};
        int[] s = new int[] {2,3,1,3,3,3,2,7,3,4};
        int[] t = new int[] {9,7,3,9,7,6,9,9,9,9};
        SS1680 ss = new SS1680();
        ss.getApplicant(r,d,s,t);
    }
}

class Order{
    public int id;
    public int start;
    public int end;
    public int day;
    public Order(int i, int s, int e, int d)
    {
        id = i;
        start = s;
        end = e;
        day = d;
    }
}
