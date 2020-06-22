package S1801TO2000;

import java.util.*;

public class S1885 {
    Map<Integer, Integer> dic = new HashMap<>();
    public List<String> strangeSort(List<Integer> mapping, List<String> nums) {
        for (int i = 0; i < mapping.size(); i++)
            dic.put(mapping.get(i), i);
        Map<String, String> map = new TreeMap<>((String s1, String s2) -> {
            String s11 = s1.replaceFirst("^0*", "");
            String s22 = s2.replaceFirst("^0*", "");
            return s11.length() == s22.length() ? s11.equals(s22) ? 1 : s11.compareTo(s22) : s11.length() - s22.length();
        });
        for (String num: nums)
            map.put(getRealVal(num), num);
        return new ArrayList<>(map.values());
    }

    public String getRealVal(String s)
    {
        StringBuilder sb = new StringBuilder();
        for (char n: s.toCharArray())
            sb.append(dic.get(n - '0'));
        return sb.toString();
    }
}
