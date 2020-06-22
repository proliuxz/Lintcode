package S401TO600;

import java.util.PriorityQueue;

class ArrayContainer implements Comparable<ArrayContainer> {
    int[] arr;
    int index;

    public ArrayContainer(int[] arr, int index) {
        this.arr = arr;
        this.index = index;
    }

    @Override
    public int compareTo(ArrayContainer o) {
        return this.arr[this.index] - o.arr[o.index];
    }
}

public class S486 {
    public int[] mergekSortedArrays(int[][] arrays) {
        PriorityQueue<ArrayContainer> queue = new PriorityQueue<>();
        int total = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] != null && arrays[i].length != 0)
            {
                queue.add(new ArrayContainer(arrays[i], 0));
                total = total + arrays[i].length;
            }
        }

        int m = 0;
        int result[] = new int[total];

        while (!queue.isEmpty()) {
            ArrayContainer ac = queue.poll();
            result[m++] = ac.arr[ac.index];

            if (ac.index < ac.arr.length - 1)
                queue.add(new ArrayContainer(ac.arr, ac.index + 1));
        }

        return result;
    }
}
