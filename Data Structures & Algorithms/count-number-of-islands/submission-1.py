class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        


        rows = len(grid)
        cols = len(grid[0])
        vis = set()
        islands = 0

        def dfs(row, col):
            if row>=0 and col>=0 and row<rows and col<cols and (row,col) not in vis and grid[row][col]=='1':
                vis.add((row,col))

                #all the 4 directions of dfs
                dfs(row-1, col)
                dfs(row, col -1)
                dfs(row+1,col)
                dfs(row,col+1)

        for row in range(rows):
            for col in range(cols):
                #check the following
                #1. island is 1
                #2. it is not already visited
                if grid[row][col]=='1' and (row,col) not in vis:
                    islands+=1
                    dfs(row,col)

        return islands

        
