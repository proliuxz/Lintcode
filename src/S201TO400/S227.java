package S201TO400;

import java.util.Stack;

public class S227 {
    private Stack<Integer> disks;
    /*
     * @param i: An integer from 0 to 2
     */
    public S227(int i) {
        // create three towers
        disks = new Stack<>();
    }

    /*
     * @param d: An integer
     * @return: nothing
     */
    public void add(int d) {
        // Add a disk into this tower
        if (!disks.isEmpty() && disks.peek() <= d) {
            System.out.println("Error placing disk " + d);
        } else {
            disks.push(d);
        }
    }

    /*
     * @param t: a tower
     * @return: nothing
     */
    public void moveTopTo(S227 t) {
        // Move the top disk of this tower to the top of t.
        int top = disks.pop();
        t.add(top);
    }

    /*
     * @param n: An integer
     * @param destination: a tower
     * @param buffer: a tower
     * @return: nothing
     */
    public void moveDisks(int n, S227 destination, S227 buffer) {
        // Move n Disks from this tower to destination by buffer tower
        if (n > 0) {
            moveDisks(n - 1, buffer, destination);
            moveTopTo(destination);
            buffer.moveDisks(n - 1, destination, this);
        }
    }

    /*
     * @return: Disks
     */
    public Stack<Integer> getDisks() {
        // write your code here
        return disks;
    }
}
