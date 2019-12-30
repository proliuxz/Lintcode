package S201TO400;

import Util.BitInteger;

import java.util.ArrayList;

public class S237 {
    public int findMissing(ArrayList<BitInteger> array) {
        return findMissing(array, 0);
    }

    private int findMissing(ArrayList<BitInteger> input, int column) {
        if (column >= BitInteger.INTEGER_SIZE)
            return 0;
        ArrayList<BitInteger> oneBits = new ArrayList<BitInteger>();
        ArrayList<BitInteger> zeroBits = new ArrayList<BitInteger>();
        for (BitInteger t : input) {
            if (t.fetch(column) == 0) {
                zeroBits.add(t);
            } else {
                oneBits.add(t);
            }
        }

        if (zeroBits.size() <= oneBits.size()) {
            int v = findMissing(zeroBits, column + 1);
            return (v << 1) | 0;
        } else {
            int v = findMissing(oneBits, column + 1);
            return (v << 1) | 1;
        }
    }
}
