package S601TO800;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S737 {
    public int FindElements(int[][] Matrix) {
        // write your code here
        List<Integer> res = new ArrayList<>();
        int h = Matrix.length;
        int w = Matrix[0].length;
        for (int i = 0; i < w ; i++) {
            res.add(Matrix[0][i]);
        }

        for (int i = 1; i < h; i++) {
            Set<Integer> line = new HashSet<>();
            for(int j = 0; j < w; j ++){
                line.add(Matrix[i][j]);
            }
            for (int j = 0; j < res.size(); j++) {
                if (!line.contains(res.get(j)))
                    res.remove(res.get(j));
            }
            if (res.size() == 1)
                return res.get(0);
        }
        return 0;
    }
}
