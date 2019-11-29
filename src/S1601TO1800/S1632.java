package S1601TO1800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class S1632 {
    public int countGroups(List<String> emails) {
        // Write your code here
        int result = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (String email: emails
        ) {
            String group = getGroup(email);
            map.put(group, map.getOrDefault(group, 0) + 1);
        }
        for (int val: map.values()
        ) {
            if (val > 1)
                result++;
        }
        return result;
    }

    public String getGroup(String email)
    {
        String[] addr = email.split("@");
        String[] nonePlus = addr[0].split("\\+");
        return nonePlus[0].replaceAll("\\.","") + addr[1];
    }

    public static void main(String[] args)
    {
        S1632 s = new S1632();
        String[] emails = new String[] {"aa+bb.cc@jiu.zhang.com", "aa++bb.cc@jiu.zhang.com", "a+b+v+c@jiuzhang.com"};
        int res = s.countGroups(Arrays.asList(emails));
        System.out.println(res);
    }
}
