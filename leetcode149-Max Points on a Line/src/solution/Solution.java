package solution;

public class Solution{
    public int maxPoints(Point[] points) {
        if(points == null) return 0;
        if(points.length <=2) return points.length;
        Map<Integer,Map<Integer,Integer>> map = new HashMap<>();
        int result = 0;
        for(int i=0; i<points.length; i++){
            map.clear();
            int overlap = 0;
            int max = 0;
            for(int j=i+1; j<points.length; j++){
                int x = points[j].x - points[i].x;
                int y = points[j].y - points[i].y;
                if(x==0 && y==0){
                  overlap++;
                  continue;
                }
                int gcd = gcd(x,y);
                if(gcd != 0){
                    x /= gcd;
                    y /= gcd;
                }
                if(map.containsKey(x)){
                    if(map.get(x).containsKey(y)){
                        map.get(x).put(y,map.get(x).get(y)+1);
                    }else{
                        map.get(x).put(y,1);
                    }
                }else{
                    Map<Integer,Integer> map2 = new HashMap<>();
                    map2.put(y,1);
                    map.put(x,map2);
                }
                max = Math.max(max,map.get(x).get(y));
                
            }
            result = Math.max(result,max+overlap+1);
        }
        return result;
    }
    public int gcd(int x, int y){
        if(y==0) return x;
        return gcd(y,x%y);
    }
}
