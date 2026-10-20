class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        int count = 0;
        boolean[][] vis = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    count = dfs(grid, vis, i, j, 0);
                    ans = Math.max(count, ans);
                }
            }
        }
        return ans;
    }

    public int dfs(int[][] grid, boolean[][] vis, int row, int col, int count) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) {
            return count;
        }

        if (grid[row][col] == 1 && !vis[row][col]) {
            vis[row][col] = true;
            count++;
        } else {
            return count;
        }

        count = dfs(grid, vis, row + 1, col, count);
        count = dfs(grid, vis, row - 1, col, count);
        count = dfs(grid, vis, row, col + 1, count);
        count = dfs(grid, vis, row, col - 1, count);

        return count;
    }
}
