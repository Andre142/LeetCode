class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        LinkedList<int[]>l=new LinkedList<>();
        int[] toAdd=newInterval;
        for (int[] i:intervals){
            if (toAdd[1]<i[0]){
                l.add(toAdd);
                toAdd=i;   
            }
            else if (toAdd[0]>i[1])
                l.add(i);
            else{
                toAdd[0]=Math.min(toAdd[0],i[0]);
                toAdd[1]=Math.max(toAdd[1],i[1]);
            }
        }
        l.add(toAdd);
        return l.toArray(new int[l.size()][2]);
    }
}