package S1201TO1400;

import java.util.ArrayList;
import java.util.List;

public class S1372 {
    public List<String> ambiguousCoordinates(String S) {
        List<String> res = new ArrayList<>();
        S = S.substring(1, S.length()-1);
        int len = S.length();
        for(int idx = 1; idx < len; idx++){
            String s1=S.substring(0, idx);
            String s2=S.substring(idx, len);

            List<String> l1=toPointString(s1);
            if(l1.isEmpty()) continue;
            List<String> l2=toPointString(s2);
            if(l2.isEmpty()) continue;
            res.addAll(mergeResult(l1,l2));

        }
        return res;
    }

    public List<String> toPointString(String s)
    {
        List<String> r = new ArrayList<>();
        if(s.length() > 1){
            int end = s.length()-1;
            if(s.charAt(end) == '0'){
                end = 0;
            }
            for(int i = 1; i <= end; i++){
                String temp1 = s.substring(0,i);
                String temp2 = s.substring(i,end+1);
                String res = temp1 +"."+temp2;
                r.add(res);
                if(s.charAt(0) == '0')
                    break;
            }
        }

        if(!(s.charAt(0) == '0') || s.length() == 1){
            r.add(s);
        }
        return r;
    }

    public List<String> mergeResult(List<String> l1,List<String> l2){
        List<String> res = new ArrayList<>();
        for(String fir: l1){
            for(String sec: l2){
                StringBuilder sb = new StringBuilder();
                sb.append("(");
                sb.append(fir);
                sb.append(", ");
                sb.append(sec);
                sb.append(")");
                res.add(sb.toString());
            }
        }
        return res;
    }
}
