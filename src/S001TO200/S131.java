package S001TO200;

import java.util.*;

public class S131 {
    public List<List<Integer>> buildingOutline(int[][] buildings) {
        List<List<Integer>> res = new ArrayList<>();
        List<int[]> height = new ArrayList<>();

        for(int[] building: buildings){
            height.add(new int[]{building[0], -building[2]});
            height.add(new int[]{building[1], building[2]});
        }

        Collections.sort(height, (int[] a, int[] b) ->
                a[0] != b[0] ?  a[0] - b[0] : (a[1] < b[1] ? -1 : (a[1] == b[1] ? 0 : 1)));

        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);

        int pre = 0, preHeight = 0;

        for(int i = 0; i < height.size(); i++){
            int[] h = height.get(i);
            if(q.isEmpty()){
                pre = h[0];
                preHeight = -h[1];
                q.offer(preHeight);
                continue;
            }

            if(h[1] < 0)
                q.offer(-h[1]);
            else
                q.remove(h[1]);

            if(q.isEmpty() || q.peek() != preHeight)
                res.add(Arrays.asList(pre, h[0], preHeight));

            if(!q.isEmpty() && q.peek() != preHeight) {
                pre = h[0];
                preHeight = q.peek();
            }

        }
        return res;
    }
}
