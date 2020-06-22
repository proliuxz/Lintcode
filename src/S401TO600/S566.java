package S401TO600;

import Util.BaseGFSClient;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class S566 extends BaseGFSClient {
    public Map<String, Integer> chunk;
    public int k;

    public S566(int chunkSize) {
        chunk = new HashMap<>();
        k = chunkSize;
    }

    public String read(String filename) {
        return chunk.containsKey(filename) ?
                IntStream.range(0, chunk.get(filename))
                .mapToObj(i -> readChunk(filename, i))
                .filter(c -> !c.isEmpty())
                .collect(Collectors.joining()) : null;
    }

    public void write(String filename, String content) {
        int len = content.length();
        int num = (len - 1) / k + 1;
        chunk.put(filename, num);
        IntStream.range(0, num).forEach(i -> {
            int start = i * k;
            int end = i == num - 1 ? len : (i + 1) * k;
            writeChunk(filename, i, content.substring(start, end));
        });
    }
}