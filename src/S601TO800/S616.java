package S601TO800;

import java.util.*;

public class S616 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int count = 0;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int[] indegree = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            if (!map.containsKey(prerequisites[i][1])) {
                map.put(prerequisites[i][1], new ArrayList<>());
            }
            indegree[prerequisites[i][0]]++;
            map.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        if (q.isEmpty()) {
            return new int[0];
        }
        int[] res = new int[numCourses];
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int temp = q.poll();
                res[count] = temp;
                count++;
                List<Integer> list = map.get(temp);

                if (list != null) {
                    for (int l : list) {
                        indegree[l]--;
                        if (indegree[l] == 0) {
                            q.offer(l);
                        }
                    }
                }
            }
        }
        return count == numCourses ? res : new int[0];
    }
}
