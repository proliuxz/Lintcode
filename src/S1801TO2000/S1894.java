package S1801TO2000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S1894 {
    public List<String> adClickAnalysis(String[] completed_purchase_user_ids, String[] ad_clicks, String[] all_user_ips) {
        Map<String, String> ip_userid = new HashMap<>();
        for (int i = 0; i < all_user_ips.length; i++){
            String[] uid_ip = all_user_ips[i].split(",");
            ip_userid.put(uid_ip[1], uid_ip[0]);
        }
        Map<String, Integer> goods_click = new HashMap<>();
        Map<String, Integer> goods_bought = new HashMap<>();
        for (int i = 0; i < ad_clicks.length; i++){
            String[] cur = ad_clicks[i].split(",");
            goods_click.put(cur[2], (goods_click.containsKey(cur[2]) ? goods_click.get(cur[2]) : 0) + 1);
            String userid = ip_userid.get(cur[0]);
            int flag = 0;
            for (int j = 0; j < completed_purchase_user_ids.length; j++)
                if (completed_purchase_user_ids[j].equals(userid)){
                    flag = 1;
                    break;
                }
            goods_bought.put(cur[2], (goods_bought.containsKey(cur[2]) ? goods_bought.get(cur[2]) : 0) + flag);
        }
        List<String> res = new ArrayList<>();
        for (String goods: goods_click.keySet())
            res.add(goods_bought.get(goods) + "/" + goods_click.get(goods) + " " + goods);
        return res;
    }
}
