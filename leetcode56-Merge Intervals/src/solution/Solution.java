package solution;

public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size() <= 1) return intervals;
        List<Interval> result = new ArrayList<>();
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                return Integer.compare(i1.start, i2.start);
            }
        });
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for(Interval i : intervals){
            if(end>=i.start){
                end=Math.max(end,i.end);
            }else{
                result.add(new Interval(start,end));
                start = i.start;
                end = i.end;
            }
        }
        result.add(new Interval(start,end));
        return result;    
    }
}
