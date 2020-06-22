package S001TO200;

import java.util.PriorityQueue;
import java.util.Queue;

public class S081 {
    public int[] medianII(int[] nums) {
        MedianFinder mf = new MedianFinder();
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            mf.addNum(nums[i]);
            res[i] = mf.findMedian();
        }
        return res;
    }

    class MedianFinder {
        private Queue<Integer> back;
        private Queue<Integer> front;

        public MedianFinder() {
            front = new PriorityQueue<>((a, b) -> b - a);
            back = new PriorityQueue<>((a, b) -> a - b);
        }

        public void addNum(int num) {
            if (front.size() == back.size()) {
                Integer headOfBack = back.peek();
                if (headOfBack != null && num > headOfBack) {
                    front.offer(back.poll());
                    back.offer(num);
                } else
                    front.offer(num);
            }
            else {
                    if (num < front.peek()) {
                        back.offer(front.poll());
                        front.offer(num);
                    } else
                        back.offer(num);
            }
        }

        public int findMedian() {
            return front.peek();
        }
    }
}
