package S1601TO1800;

import java.util.Arrays;
import java.util.stream.Collectors;

public class S1173 {
    public String reverseWords(String s) {
        return Arrays.stream(s.split(" ")).map(x -> new StringBuilder(x).reverse().toString()).collect(Collectors.joining(" "));
    }
}
