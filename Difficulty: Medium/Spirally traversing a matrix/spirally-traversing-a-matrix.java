class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        ArrayList<Integer> result = new ArrayList<>();
        int dir = -1;
        int i = 0, j = 0, count=0;
        boolean[][] check = new boolean[m][n];
        
        for(int y=0; y<m; ++y){
            Arrays.fill(check[y], true);
        }
        
        while(count<Math.floor((m+n)/2)){
            dir*=-1;
            while(j<n && j>=0 && check[i][j]){
                result.add(mat[i][j]);
                check[i][j] = false;
                j+=dir;
            }
            j-=dir;
            i+=dir;
            
            while(i<m && i>=0 && check[i][j]){
                result.add(mat[i][j]);
                check[i][j] = false;
                i+=dir;
            }
            i-=dir;
            j-=dir;
            
            count++;
        }
        
        return result;
    }
}
