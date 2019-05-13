package S001TO200;

import java.util.ArrayList;
import java.util.List;

public class S009 {
    public List<String> fizzBuzz(int n) {
        // write your code here
        List<String> result = new ArrayList<>();
        if (n == 0)
            return result;
        String[] tmp = new String[]{"","","fizz","","buzz",
                                    "fizz","","","fizz","buzz",
                                    "","fizz","","","fizz buzz"};
        for (int i = 1, flag = 0; i < n + 1; i++)
        {
            String temp = tmp[flag];
            if (temp == "")
                temp = String.valueOf(i);
            flag++;
            if(flag == 15)
                flag = 0;
            result.add(temp);
        }
        return result;
    }
}
