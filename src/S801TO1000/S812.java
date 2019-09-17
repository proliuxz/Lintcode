package S801TO1000;

public class S812 {
    public String boldWords(String[] words, String S) {
        // Write your code here
        int n = S.length();
        boolean[] mark = new boolean[n];
        // search each word in s, find all the matching part and mark them
        for (String word : words) {
            int start = 0;
            while ((start = S.indexOf(word, start)) >= 0) {
                for (int i = start; i < start + word.length(); ++i) {
                    mark[i] = true;
                }

                ++start; // start from next position!
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            if (mark[i] && (i == 0 || !mark[i - 1])) {
                sb.append("<b>");
            }

            sb.append(S.charAt(i));

            if (mark[i] && (i == n - 1 || !mark[i + 1])) {
                sb.append("</b>");
            }
        }

        return sb.toString();
    }
}
