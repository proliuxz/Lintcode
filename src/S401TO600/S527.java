package S401TO600;

import java.util.NavigableMap;
import java.util.Stack;
import java.util.TreeMap;

public class S527 {
    class TrieNode {
      public NavigableMap<Character, TrieNode> children;
      public TrieNode() {
          children = new TreeMap<>();
     }
  }

    public String serialize(TrieNode root) {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (Character key: root.children.keySet()) {
            sb.append(key);
            sb.append(serialize(root.children.get(key)));
        }
        sb.append(">");
        return sb.toString();
    }


    public TrieNode deserialize(String data) {
        if (data == null || data.length() == 0)
            return null;

        TrieNode root = new TrieNode();
        TrieNode current = root;
        Stack<TrieNode> path = new Stack<TrieNode>();
        for (Character c : data.toCharArray()) {
            switch (c) {
                case '<':
                    path.push(current);
                    break;
                case '>':
                    path.pop();
                    break;
                default:
                    current = new TrieNode();
                    path.peek().children.put(c, current);
            }
        }
        return root;
    }
}
