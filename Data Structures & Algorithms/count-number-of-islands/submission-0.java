class Solution {
    public int numIslands(char[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        int count=0;
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    count++;
                    dfs(grid,vis,i,j);
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid ,boolean[][] vis, int row, int col){

        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length){
            return;
        }

        if(grid[row][col]=='1' && !vis[row][col]){
            vis[row][col]=true;
            } 
        else return;

        dfs(grid, vis, row+1, col);
        dfs(grid, vis, row-1, col);
        dfs(grid, vis, row, col+1);
        dfs(grid, vis, row, col-1);

    }
}
