package S401TO600;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class S565 {
    public Map<String, Integer> ips;
    public int k;
    public S565() {
        ips = new HashMap<>();
    }

    public void initialize(List<String> slaves_ip_list, int k) {
        this.k = k;
        slaves_ip_list.stream().forEach(ip -> ips.put(ip, 0));
    }

    public void ping(int timestamp, String slave_ip) {
        if(ips.containsKey(slave_ip))
            ips.put(slave_ip, timestamp);
    }

    public List<String> getDiedSlaves(int timestamp) {
        return ips.keySet().stream().filter(ip -> (timestamp - 2 * k) >= ips.get(ip)).collect(Collectors.toList());
    }
}
