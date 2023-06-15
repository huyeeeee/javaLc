package org.leetcode.items._201_300;

/**
 * @Author: hujiangping
 * @Date: 2023/6/13 20:17
 * @Description: _208_实现Trie
 * @Version 1.0.0
 */
public class _208_实现Trie {
}
class Trie {
    Trie[] children;
    boolean isEnd;

    public Trie() {
        children = new Trie[26];
    }

    public void insert(String word) {
        insert(this, word, 0);
    }

    private void insert(Trie node, String word, int index) {
        if (node == null) return;
        if (index == word.length()) {
            node.isEnd = true;
            return;
        }
        int i = word.charAt(index) - 'a';
        if (node.children[i] == null){
            node.children[i] = new Trie();
        }
        insert(node.children[i], word, index + 1);
    }

    public boolean search(String word) {
        Trie node = this;
        int index = 0;
        while (index < word.length()) {
            int i = word.charAt(index) - 'a';
            if (node.children[i] == null) return false;
            node = node.children[i];
            index += 1;
        }
        return node.isEnd;
    }

    public boolean startsWith(String prefix) {

        Trie node = this;
        int index = 0;
        while (index < prefix.length()) {
            int i = prefix.charAt(index) - 'a';
            if (node.children[i] == null) return false;
            node = node.children[i];
            index += 1;
        }
        for (int i = 0; i < node.children.length; i++) {
            if (node.children[i] != null) return true;
        }
        return node.isEnd;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
