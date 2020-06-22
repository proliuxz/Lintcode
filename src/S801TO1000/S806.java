package S801TO1000;

import java.util.ArrayList;
import java.util.List;

public class S806 {
    public int buyFruits(List<List<String>> codeList, List<String> shoppingCart) {
        List<String> list = new ArrayList<>();

        for(List<String> i: codeList)
            list.addAll(i);

        if(list.size() > shoppingCart.size())
            return 0;

        for(int i = 0; i + list.size() <= shoppingCart.size(); i++) {
            for(int j = 0; j < list.size(); j++) {
                if(list.get(j).equals("anything")) {
                    if(j == list.size() - 1)
                        return 1;
                    continue;
                }
                if(!list.get(j).equals(shoppingCart.get(i + j)))
                    break;

                if(j == list.size() - 1)
                    return 1;
            }
        }
        return 0;
    }
}
