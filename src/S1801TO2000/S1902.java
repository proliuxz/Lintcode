package S1801TO2000;

import java.util.List;

public class S1902 {
    public boolean FindGoogle(List<String> S) {
        for (String str: S) {
            if(helper(str))
                return true;
        }
        return false;
    }

    public boolean helper(String s)
    {
        s = s.toLowerCase();
        int gIdx = s.indexOf("google");
        if (gIdx < 0)
            return false;
        if (s.contains("//"));
        {
            int sy = s.indexOf("//");
            if (sy >= 0 && sy < gIdx)
                return true;
        }
        if (s.contains("/*") && s.contains("*/"))
        {
            int sy = s.indexOf("/*");
            int ey = s.indexOf("*/");
            if (sy >= 0 && sy < gIdx && gIdx < ey)
                return true;
        }
        return false;
    }
}
