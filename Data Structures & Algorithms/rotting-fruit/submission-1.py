class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        
        minutes = 0
        fresh = 0 
        q = deque()
        ROW, COL = len(grid), len(grid[0])

        # go through the matrix to find 
        #number of fresh fruit and add rotten fruits to queue

        for r in range(ROW):
            for c in range(COL):
                if grid[r][c]==1: fresh+=1
                if grid[r][c]==2: q.append((r, c))


        directions = [[0,1],[1,0],[0,-1],[-1,0]]

        #iterate until queue is empty or number of fresh fruits are not rotten
        while q and fresh!=0:
            for i in range(len(q)):
                r, c = q.popleft()
                for dr, dc in directions:
                    row,col=dr+r, dc+c
                    if(
                        row>=0 and col>=0 and 
                        row<ROW and col< COL and 
                        grid[row][col]!=0 and grid[row][col]!=2
                        ):
                        q.append((row, col))
                        grid[row][col]=2
                        fresh-=1
            minutes+=1

        return minutes if fresh==0 else -1
                
