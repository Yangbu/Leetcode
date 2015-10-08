/**
 * 
 */
package solution;

/**
 * Trie based solution
 *
 */
public class Solution {
    WordNode root = new WordNode();
    // Adds a word into the data structure.
    public void addWord(String word) {
        addWord(word.toCharArray(), 0, root );
    }
    private void addWord(char[] result, int index, WordNode parent){
        char c = result[index];
        int inx = c - 'a';
        WordNode node = parent.children[inx];
        if(node == null){
            node = new WordNode();
            parent.children[inx] =node;
        }
        if(result.length == index+1){
            node.isLeaf = true;
            return;
        }
        addWord(result, index+1, node);
    }
    
    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return search(word.toCharArray(), 0 , root);
    }
    private boolean search(char[] result, int index, WordNode parent){
        if(result.length == index){
            if(parent.isLeaf) return true;
            return false;
        }
        char c = result[index];
         WordNode[] childs = parent.children;
        if(c == '.'){
            for(int i=0; i<childs.length; i++){
                WordNode r = childs[i];
                if(r != null){
                    boolean last = search(result, index+1, r);
                    if(last) return true;
                }
            }
            return false;
        }
        WordNode n = childs[c - 'a'];
        
        if(n == null) return false;
        return search(result, index+1, n);
    }
    private class WordNode{
    boolean isLeaf;
    WordNode[] children = new WordNode[26];
}
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");


