package solution;

import java.util.Arrays;

/*
 * 1、将某作者的所有文章的引用频次按照从大到小的位置排列

             2、从前到后，找到最后一个满足条件的位置，其条件为：

                           此位置是数组的第x个，其值为y，必须满足 y >= x;
 * 
 * 
 * 
 */

public class Solution {
    public int hIndex(int[] citations) {
        int h =0;
        if(citations==null) return h;
        Arrays.sort(citations);
        for(int i = citations.length-1; i>=0 && citations[i] >= (citations.length - i); i--){
            h = citations.length - i;
        }
        return h;
    }
}
