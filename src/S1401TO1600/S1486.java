package S1401TO1600;

import java.util.*;

public class S1486 {
    public String[] getRuntime(String[] a) {
        // Write your code here

        Map<String, int[]> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            String[] frags = a[i].split(" ");
            String name = frags[0];
            String opt = frags[1];
            int time = Integer.valueOf(frags[2]);
            if (map.containsKey(name))
            {
                int[] task = map.get(name);
                if (opt.equals("Exit"))
                {
                    task = new int[] {task[0] + time - task[1], 0};
                }
                else
                {
                    task = new int[] {task[0], time};
                }
                map.put(name, task);
            }
            else
            {
                map.put(name, new int[] {0, time});
            }
        }
        int cnt = 0;
        String[] keys = new String[map.size()];
        for (String key : map.keySet()) {
            keys[cnt] = key;
            cnt++;
        }
        String[] res = new String[keys.length];
        Arrays.sort (keys);
        for (int i = 0; i < cnt; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(keys[i]);
            sb.append("|");
            sb.append(map.get(keys[i])[0]);
            res[i] = sb.toString();
        }
        return res;
    }

    public static void main(String[] args)
    {
        S1486 s = new S1486();
        String[] opts = new String[] {"F1 Enter 10","F1 Exit 18","F1 Enter 19","F1 Exit 20"};
        String[] res = s.getRuntime(opts);
        for (String r: res
             ) {
            System.out.println(r);
        }
    }
}
