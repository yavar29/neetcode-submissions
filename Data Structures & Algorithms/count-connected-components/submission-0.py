class Solution:
    def countComponents(self, n: int, edges: List[List[int]]) -> int:
        par = [i for i in range(n)]

        # function to find the Parent of the node
        def find(x):
            if x == par[x]:
                return x
            return find(par[x])

        def union(x, y):
            # step 1: find the parents for both nodes
            par_x = find(x)
            par_y = find(y)

            # if both parents are same - no changes made
            if par_x == par_y:
                return 0

            # we have to perform union
            par[par_y] = par_x
            return 1

        components = n
        for u, v in edges:
            components -= union(u, v)

        return components