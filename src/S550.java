import java.util.*;

public class S550 {
    private int k;
    private Map<String, Integer> map;
    private TreeSet<String> set;

    public S550(int k) {
        this.k = k;
        map = new HashMap<>(k);
        set = new TreeSet<>((s1, s2) -> {
            int s1Freq = map.get(s1), s2Freq = map.get(s2);
            if (s1Freq != s2Freq) {
                return s2Freq - s1Freq;
            } else {
                return s1.compareTo(s2);
            }
        });
    }

    public void add(String word) {
        if (map.containsKey(word)) {
            if (set.contains(word)) {
                set.remove(word);
            }
            map.put(word, map.get(word) + 1);
        } else {
            map.put(word, 1);
        }

        set.add(word);
        if (set.size() > k) {
            set.pollLast();
        }
    }


    public List<String> topk() {
        List<String> result = new ArrayList<String>(k);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            result.add(it.next());
        }
        return result;
    }

    public static void main(String[] args)
    {
        S550 s = new S550(2);
        s.add("lint");
        s.add("code");
        s.add("code");
        s.add("coding");
        s.add("coding");
        s.add("coding");
        s.add("lint");
        s.add("lint");
        List<String> res = s.topk();
        for(String r : res)
        {
            System.out.println(r);
        }
    }
}
