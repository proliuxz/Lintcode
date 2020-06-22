package S401TO600;

public class S442 {
    TrieNode root = null;

    public S442() {
        root = new TrieNode();
    }

    // O(word.length())
    public void insert(String word) {
        TrieNode p = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (p.children[index] == null) {
                p.children[index] = new TrieNode();
            }
            p = p.children[index];
        }
        p.isWord = true;
        p.word = word;
    }

    public boolean search(String word) {
        TrieNode p = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (p.children[index] == null) {
                return false;
            }
            p = p.children[index];
        }
        return p.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode p = root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (p.children[index] == null) {
                return false;
            }
            p = p.children[index];
        }
        return true;
    }
}

class TrieNode {
    public TrieNode[] children;
    public boolean isWord;
    public String word;

    public TrieNode() {
        children = new TrieNode[26];
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
        isWord = false;
    }
}
