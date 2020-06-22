package S1001TO1200;

import java.util.Arrays;
import java.util.stream.Collectors;

public class S1153 {
    public String sorting(String s) {
        return Arrays.stream(s.split(",")).sorted().collect(Collectors.joining(","));
    }
}
