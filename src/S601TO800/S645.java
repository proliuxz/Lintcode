package S601TO800;

import java.util.Stack;

public class S645 {
    public int findCelebrity(int n) {
        Stack<Integer> st = new Stack<>();
        int c;

        for (int i = 0; i < n; i++)
            st.push(i);

        while (st.size() > 1)
        {
            int a = st.pop();
            int b = st.pop();

            if (knows(a, b))
                st.push(b);
            else
                st.push(a);
        }

        c = st.pop();

        for (int i = 0; i < n; i++)
            if (i != c && (knows(c, i) || !knows(i, c)))
                return -1;
        return c;
    }

    private boolean knows(int a, int b)
    {
        return true;
    }
}
