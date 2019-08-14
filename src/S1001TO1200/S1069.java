package S1001TO1200;

import java.util.ArrayList;
import java.util.List;

public class S1069 {
    public List<String> removeComments(String[] source) {
        List<String> res = new ArrayList<>();

        int row = 0;
        int col = 0;
        boolean block = false;

        StringBuilder line = new StringBuilder();
        while (row < source.length) {
            if (block) {
                int idx = source[row].indexOf("*/", col);
                if (idx == -1) {
                    ++row;
                    col = 0;
                } else {
                    block = false;
                    col = idx + 2;
                }
            } else {
                int idx1 = source[row].indexOf("/*", col);
                int idx2 = source[row].indexOf("//", col);

                if (idx1 == -1) {
                    idx1 = source[row].length();
                }
                if (idx2 == -1) {
                    idx2 = source[row].length();
                }

                for (int i = col; i < Math.min(idx1, idx2); ++i) {
                    line.append(source[row].charAt(i));
                }

                if (idx2 <= idx1) {
                    if (line.length() != 0) {
                        res.add(line.toString());
                        line.setLength(0);
                    }

                    ++row;
                    col = 0;
                } else if (idx1 < idx2) {
                    block = true;
                    col = idx1 + 2;
                }
            }
        }

        return res;
    }
}
