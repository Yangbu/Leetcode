package solution;
class SegmentTree{
    int start,end;
    SegmentTree left,right;
    int sum;
    public SegmentTree(int start, int end){
        this.start = start;
        this.end = end;
        left = null;
        right = null;
        this.sum = 0;
    }
}
SegmentTree root=null;
public NumArray(int[] nums) {
    root = buildTree(nums,0,nums.length-1);
}

public SegmentTree buildTree(int[] nums, int start, int end){
    if(start>end) return null;
    else{
        SegmentTree seg = new SegmentTree(start,end);
        if(start==end) seg.sum = nums[start];
        else{
            int mid = start+(end-start)/2;
            seg.left = buildTree(nums,start,mid);
            seg.right = buildTree(nums,mid+1,end);
            seg.sum = seg.left.sum+seg.right.sum;
        }
        return seg;
    }
}

void update(int i, int val) {
    updateTree(root,i,val);
}

void updateTree(SegmentTree root, int i, int val){
    if(root.start == root.end) root.sum = val;
    else{
        int mid = root.start + (root.end-root.start)/2;
        if(i<=mid) updateTree(root.left,i,val);
        else updateTree(root.right,i,val);
        root.sum = root.left.sum+root.right.sum;
    }
}

public int sumRange(int i, int j) {
    return sumRangeTree(root,i,j);
}
public int sumRangeTree(SegmentTree root, int i, int j){
    if(root.start==i && root.end == j) return root.sum;
    else{
        int mid = root.start+(root.end-root.start)/2;
        if(j<=mid) return sumRangeTree(root.left,i,j);
        else if(i>=mid+1) return sumRangeTree(root.right,i,j);
        else return sumRangeTree(root.left,i,mid)+sumRangeTree(root.right,mid+1,j);
    }
}
}
