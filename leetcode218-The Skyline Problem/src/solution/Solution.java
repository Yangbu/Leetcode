package solution;
/*
 * Detailed explanation: http://www.geeksforgeeks.org/divide-and-conquer-set-7-the-skyline-problem/
 * 
 */

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<int[]> getSkyline(int[][] buildings) {
        if(buildings.length == 0){
            return new LinkedList<int[]>();
        }
        return recurSkyline(buildings , 0 , buildings.length-1);
        
    }
    public LinkedList<int[]> recurSkyline(int[][] buildings , int m , int n){
        if(m<n){
            int mid = m + (n-m)/2;
            return merge(recurSkyline(buildings , m , mid),recurSkyline(buildings , mid+1 , n));
        }else{
            LinkedList<int[]> result =new LinkedList<int[]>();
            result.add(new int[]{buildings[m][0],buildings[m][2]});
            result.add(new int[]{buildings[m][1],0});
            return result;
        }
    }
    public LinkedList<int[]> merge(LinkedList<int[]> l1, LinkedList<int[]> l2){
        LinkedList<int[]> result =new LinkedList<int[]>();
        int h1=0, h2=0;
        while(l1.size()>0 && l2.size()>0){
            int x=0, h=0;
            if(l1.getFirst()[0] < l2.getFirst()[0]){
                x = l1.getFirst()[0];
                h1 = l1.getFirst()[1];
                h = Math.max(h1,h2);
                l1.removeFirst();
            }else if(l1.getFirst()[0] > l2.getFirst()[0]){
                x = l2.getFirst()[0];
                h2 = l2.getFirst()[1];
                h = Math.max(h1,h2);
                l2.removeFirst();
            }else{
                x = l2.getFirst()[0];
                h1 = l1.getFirst()[1];
                h2 = l2.getFirst()[1];
                h = Math.max(h1,h2);
                l1.removeFirst();
                l2.removeFirst();
            }
            if(result.size()==0 || h != result.getLast()[1]){
                result.add(new int[]{x,h});
            }
        }
        result.addAll(l1);
        result.addAll(l2);
        return result;
    }
    
}
