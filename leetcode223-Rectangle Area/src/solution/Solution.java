package solution;

public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
       int left = Math.max(A,E);
       int right = Math.max(left,Math.min(C,G));
       int top = Math.min(D,H);
       int bottom = Math.min(top,Math.max(B,F));
       return (C-A)*(D-B) - (right - left)*(top - bottom)+(G-E)*(H-F);
    }
}
