package S1201TO1400;

import java.util.ArrayList;
import java.util.List;

public class S1361 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList();
        int index = 0;
        while (index < words.length) {
            int count = words[index].length();
            StringBuilder sb = new StringBuilder();
            int last = index + 1;
            while (last < words.length) {
                if (count + 1 + words[last].length() > maxWidth)
                    break;
                count = count + 1 + words[last].length();
                last++;
            }

            int diff = last - 1 - index;
            sb.append(words[index]);
            if (last == words.length || diff == 0) {
                for (int i = index + 1; i < last; i++) {
                    sb.append(" ");
                    sb.append(words[i]);
                }
                for (int i = sb.length(); i < maxWidth; i++)
                    sb.append(" ");
            } else {
                int space = (maxWidth - count) / diff;
                int r = (maxWidth - count) % diff;
                for (int i = index + 1; i < last; i++) {
                    for (int j = 0; j < space; j++)
                        sb.append(" ");
                    if (r > 0) {
                        sb.append(" ");
                        r--;
                    }
                    sb.append(" ");
                    sb.append(words[i]);
                }
            }
            res.add(sb.toString());
            index = last;
        }
        return res;
    }
}
