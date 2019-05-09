import java.util.ArrayList;
import java.util.List;

public class S485 {
    public List<Integer> generate(int size) {
        // write your code here
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < size + 1 ; i++) {
            res.add(i);
        }
        return res;
    }
}
