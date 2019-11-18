package S1601TO1800;

import java.util.List;

public class S1614 {
    public String highestGrowth(List<List<String>> Stock) {
        // Write your code here
        String res = "";
        double max = Double.MIN_VALUE;
        for(List<String> stock : Stock) {
            double rate = (Double.valueOf(stock.get(2)) - Double.valueOf(stock.get(1))) / Double.valueOf(stock.get(1));
            if(rate > max) {
                max = rate;
                res = stock.get(0);
            }
        }
        return res;
    }
}
