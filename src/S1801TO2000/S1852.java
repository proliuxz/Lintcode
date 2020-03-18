package S1801TO2000;

import java.util.Stack;

public class S1852 {
    public int[] FinalDiscountedPrice(int[] prices) {
        int[] res = prices;
        Stack<Integer> s = new Stack<>();
        for(int i = 0;i < prices.length;i++){
            while(!s.isEmpty() && prices[s.peek()] >= prices[i]) {
                int idx = s.pop();
                res[idx] = prices[idx] - prices[i];
            }
            s.push(i);
        }
        return res;
    }
}
