package S1801TO2000;
import java.util.PriorityQueue;
class Node {

    int elementIndex;
    int arrayIndex;

    public Node(int elementIndex, int arrayIndex) {
        super();
        this.elementIndex = elementIndex;
        this.arrayIndex = arrayIndex;
    }

}

public class S1874 {
    public int kthSmallest(int[][] arr, int k) {
        int ans = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> {
            return arr[a.arrayIndex][a.elementIndex] -
                    arr[b.arrayIndex][b.elementIndex];
        });

        for (int i = 0; i < arr.length; i++) {
            int[] line = arr[i];
            if (line != null) {
                Node n = new Node(0, i);
                pq.add(n);
            }
        }

        int count = 0;

        while (!pq.isEmpty()) {
            Node curr = pq.poll();
            if (curr.elementIndex < arr[curr.arrayIndex].length)
            {
                ans = arr[curr.arrayIndex][curr.elementIndex];
                if (++count == k) {
                    break;
                }
                curr.elementIndex++;
            }
            pq.offer(curr);
        }
        return ans;
    }
}
