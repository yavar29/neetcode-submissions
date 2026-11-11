class Solution:
    def countComponents(self, n: int, edges: List[List[int]]) -> int:
        par = [i for i in range(n)]
        rank = [1] * n          # optional: keeps trees shallow

        # find the root parent of x (with path compression)
        def find(x):
            while x != par[x]:
                par[x] = par[par[x]]   # point x to its grandparent
                x = par[x]
            return x

        def union(x, y):
            # step 1: find the parents (roots) of both nodes
            par_x = find(x)
            par_y = find(y)

            # step 2: same root -> already connected, no change
            if par_x == par_y:
                return 0

            # step 3: attach the smaller tree under the bigger one
            if rank[par_x] >= rank[par_y]:
                par[par_y] = par_x
                rank[par_x] += rank[par_y]
            else:
                par[par_x] = par_y
                rank[par_y] += rank[par_x]
            return 1   # one merge happened

        components = n
        for u, v in edges:
            components -= union(u, v)

        return components