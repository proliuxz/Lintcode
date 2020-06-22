package Util;

import java.util.Map;

public class BaseGFSClient {
    private Map<String, String> chunk_list;

    public BaseGFSClient() {
    }

    public String readChunk(String filename, int chunkIndex) {
        return "";
    }

    public void writeChunk(String filename, int chunkIndex,
                           String content) {

    }
}
