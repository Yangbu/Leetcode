package solution;

import java.util.Arrays;

/*
 * 1����ĳ���ߵ��������µ�����Ƶ�ΰ��մӴ�С��λ������

             2����ǰ�����ҵ����һ������������λ�ã�������Ϊ��

                           ��λ��������ĵ�x������ֵΪy���������� y >= x;
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
