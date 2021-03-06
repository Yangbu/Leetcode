package solution;

public class Solution {

    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        int len = 1;
        Set<String> beginSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();
        Set<String> visited = new HashSet<>();
        beginSet.add(beginWord);
        endSet.add(endWord);
        visited.add(beginWord);
        visited.add(endWord);

        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
            // add new words to smaller set to achieve better performance
            boolean isBeginSetSmall = beginSet.size() < endSet.size();
            Set<String> small = isBeginSetSmall ? beginSet : endSet;
            Set<String> big = isBeginSetSmall ? endSet : beginSet;
            Set<String> next = new HashSet<>();
            len++;
            for (String str : small) {
                // construct all possible words
                for (int i = 0; i < str.length(); i++) {
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        StringBuilder sb = new StringBuilder(str);
                        sb.setCharAt(i, ch);
                        String word = sb.toString();
                        if (big.contains(word)) {
                            return len;
                        }
                        if (wordDict.contains(word) && !visited.contains(word)) {
                            visited.add(word);
                            next.add(word);
                        }
                    }
                }
            }
            if (isBeginSetSmall) {
                beginSet = next;
            } else {
                endSet = next;
            }
        }
        return 0;
    }
