package S001TO200;

import java.util.*;

public class S121 {
    public List<List<String>> findLadders(String start, String end, Set<String> dict) {
        List<List<String>> ans = new ArrayList<>();
        dict.add(start);
        dict.add(end);
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        bfs(start, end, dict, map);
        ArrayList<String> temp = new ArrayList<String>();
        temp.add(start);
        findLaddersHelper(start, end, map, temp, ans);
        return ans;
    }

    private void findLaddersHelper(String beginWord, String endWord, HashMap<String, ArrayList<String>> map,
                                   ArrayList<String> temp, List<List<String>> ans) {
        if (beginWord.equals(endWord)) {
            ans.add(new ArrayList<String>(temp));
            return;
        }
        ArrayList<String> neighbors = map.getOrDefault(beginWord, new ArrayList<String>());
        for (String neighbor : neighbors) {
            temp.add(neighbor);
            findLaddersHelper(neighbor, endWord, map, temp, ans);
            temp.remove(temp.size() - 1);
        }
    }

    private void bfs(String beginWord, String endWord, Set<String> words, HashMap<String, ArrayList<String>> map) {
        Set<String> set1 = new HashSet<String>();
        set1.add(beginWord);
        Set<String> set2 = new HashSet<String>();
        set2.add(endWord);
        bfsHelper(set1, set2, words, true, map);
    }

    private boolean bfsHelper(Set<String> set1, Set<String> set2, Set<String> wordSet, boolean direction,
                              HashMap<String, ArrayList<String>> map) {
        if(set1.isEmpty()){
            return false;
        }

        if (set1.size() > set2.size()) {
            return bfsHelper(set2, set1, wordSet, !direction, map);
        }

        wordSet.removeAll(set1);
        wordSet.removeAll(set2);

        boolean done = false;

        Set<String> set = new HashSet<String>();

        for (String str : set1) {
            for (int i = 0; i < str.length(); i++) {
                char[] chars = str.toCharArray();
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    if(chars[i] == ch){
                        continue;
                    }
                    chars[i] = ch;

                    String word = new String(chars);

                    String key = direction ? str : word;
                    String val = direction ? word : str;

                    ArrayList<String> list = map.containsKey(key) ? map.get(key) : new ArrayList<String>();

                    if (set2.contains(word)) {
                        done = true;
                        list.add(val);
                        map.put(key, list);
                    }

                    if (!done && wordSet.contains(word)) {
                        set.add(word);
                        list.add(val);
                        map.put(key, list);
                    }
                }
            }
        }
        return done || bfsHelper(set2, set, wordSet, !direction, map);
    }
}
