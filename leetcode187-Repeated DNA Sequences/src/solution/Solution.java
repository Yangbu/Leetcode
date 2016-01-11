package solution;

public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new LinkedList<>();
        Set<Integer> word = new HashSet<>();
        Set<Integer> doubleWord = new HashSet<>();
        char[] map = new char[26];
        map['C'-'A'] = 1;
        map['G'-'A'] = 2;
        map['T'-'A'] = 3;
        
        for(int i=0; i<s.length()-9; i++){
            int num = 0;
            for(int j=i; j<i+10; j++){
                num <<= 2;
                num |= map[s.charAt(j)-'A'];
            }
            if(!word.add(num) && doubleWord.add(num)) result.add(s.substring(i,i+10));
        }
        return result;
    }
}
