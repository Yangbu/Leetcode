package solution;

public class Solution {
    int[] unionSet;
    boolean[] hasEdgeO;
   public void solve(char[][] board) {
       if(board.length ==0 || board[0].length ==0) return;
       int height = board.length;
       int width = board[0].length;
       unionSet = new int[height*width];
       hasEdgeO = new boolean[unionSet.length];
       for(int i=0; i<unionSet.length; i++) unionSet[i] = i;
       for(int i=0; i<hasEdgeO.length;i++){
           int x = i/width; int y = i%width;
           hasEdgeO[i] =(board[x][y]=='O' && (x==0||y==0||x==board.length-1||y==board[0].length-1));
       }
       
       for(int i=0; i<unionSet.length; i++){
           int x=i/width; int y=i%width; int up = x-1; int right = y+1;
           if(up>=0 && board[x][y]==board[up][y] ) union(i,i-width);
           if(right<width && board[x][y]==board[x][right]) union(i,i+1);
       }
       for(int i=0; i<unionSet.length; i++){
           int x=i/width; int y=i%width;
           if(board[x][y]=='O' && !hasEdgeO[findSet(i)]) board[x][y] = 'X';
       }
       
   }
   public void union(int x , int y){
       int rootX = findSet(x);
       int rootY = findSet(y);
       boolean hasEdgeO = this.hasEdgeO[rootX] || this.hasEdgeO[rootY];
       unionSet[rootX] = rootY;
       this.hasEdgeO[rootY] = hasEdgeO;
       
   }
   public int findSet(int x){
       if(unionSet[x]==x) return x;
       unionSet[x]=findSet(unionSet[x]);
       return unionSet[x];
   }
}
