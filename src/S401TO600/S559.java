package S401TO600;

import Util.TrieNode;

public class S559 {
    private TrieNode root = null;

    public S559() {
        root = new TrieNode();
    }

    public TrieNode getRoot() {
        return root;
    }

    public void insert(String word, int frequency) {
        TrieNode iter = root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!iter.children.containsKey(c)) {
                iter.children.put(c, new TrieNode());
            }

            TrieNode node = iter.children.get(c);
            int insert_idx;
            for (insert_idx = 0; insert_idx < node.top10.size(); insert_idx++) {
                if (node.top10.get(insert_idx) <= frequency) {
                    break;
                }
            }

            node.top10.add(insert_idx, frequency);

            if (node.top10.size() == 11) {
                node.top10.remove(10);
            }

            iter = node;
        }
    }
}