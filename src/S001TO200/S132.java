package S001TO200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class TrieNode {
    TrieNode[] next = new TrieNode[27];
    String word;
    public void add(String s, int index) {
        char c = s.charAt(index);
        if (next[c - 'a'] == null)
            next[c - 'a'] = new TrieNode();
        if (index + 1 < s.length())
            next[c - 'a'].add(s, index + 1);
        else
            next[c - 'a'].word = s;
    }
}

public class S132 {
    char[][] grid;
    public List<String> wordSearchII(char[][] board, List<String> words) {
        grid = board;
        TrieNode root = new TrieNode();
        for (String s : words)
            root.add(s, 0);
        Set<String> res = new HashSet<>();
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                dfs(i, j, root.next[board[i][j] - 'a'], res);
        return new ArrayList<>(res);
    }

    private void dfs(int i, int j, TrieNode root, Set<String> res) {
        if (root == null)
            return;
        if (root.word != null)
            res.add(root.word);
        char c = grid[i][j];
        grid[i][j] = 'z' + 1;
        if (i > 0)
            dfs(i - 1, j, root.next[grid[i - 1][j] - 'a'], res);
        if (j > 0)
            dfs(i, j - 1, root.next[grid[i][j - 1] - 'a'], res);
        if (i < grid.length - 1)
            dfs(i + 1, j, root.next[grid[i + 1][j] - 'a'], res);
        if (j < grid[0].length - 1)
            dfs(i, j + 1, root.next[grid[i][j + 1] - 'a'], res);
        grid[i][j] = c;
    }
}
