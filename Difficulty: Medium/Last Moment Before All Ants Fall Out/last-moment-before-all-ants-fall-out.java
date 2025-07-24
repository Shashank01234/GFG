class Solution {
    public int getLastMoment(int n, int left[], int right[]) {
        int lastmoment = 0;
        
        for(int l: left){
            lastmoment = Math.max(lastmoment, l);
        }
        
        for(int r: right){
            lastmoment = Math.max(lastmoment, n-r);
        }
        
        return lastmoment;
    }
}