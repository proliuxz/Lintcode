package S601TO800;

import java.util.Iterator;
import java.util.List;

public class S601 implements Iterator<Integer> {
    private Iterator<List<Integer>> p;
    private Iterator<Integer> c;

    public S601(List<List<Integer>> vec2d) {
        p = vec2d.iterator();
        c = null;
    }

    @Override
    public Integer next() {
        return hasNext() ? c.next() : null;
    }

    @Override
    public boolean hasNext() {
        while ((c == null || !c.hasNext()) && p.hasNext())
            c = p.next().iterator();
        return c != null && c.hasNext();
    }

    @Override
    public void remove() {

    }
}
