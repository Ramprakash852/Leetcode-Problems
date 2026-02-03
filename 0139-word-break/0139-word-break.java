class Solution {

    public class Node {
        Node[] child = new Node[26];
        boolean eow = false;
    }

    public Node root = new Node();

    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.child[idx] == null) {
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }

    public boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.child[idx] == null) {
                return false;
            }
            curr = curr.child[idx];
        }
        return curr.eow;
    }

    public boolean wordbreakhelper(String key, Map<String, Boolean> memo) {
        if (key.length() == 0) return true;

        if (memo.containsKey(key)) return memo.get(key);

        for (int i = 1; i <= key.length(); i++) {
            String prefix = key.substring(0, i);
            String suffix = key.substring(i);
            if (search(prefix) && wordbreakhelper(suffix, memo)) {
                memo.put(key, true);
                return true;
            }
        }

        memo.put(key, false);
        return false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        for (String word : wordDict) {
            insert(word);
        }
        return wordbreakhelper(s, new HashMap<>());
    }
}
