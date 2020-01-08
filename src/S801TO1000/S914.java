package S801TO1000;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class S914  {
    public List<String> generatePossibleNextMoves(String s) {
        String min = "--";
        return IntStream.range(0, s.length() - 1).filter(i -> s.charAt(i) == '+' && s.charAt(i + 1) == '+').mapToObj(i -> new StringBuilder(s).replace(i, i + 2, min).toString()).collect(Collectors.toList());
    }
}
