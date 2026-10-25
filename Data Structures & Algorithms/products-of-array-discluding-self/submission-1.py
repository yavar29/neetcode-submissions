class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        prefix = [1] * n
        postfix = [1] * n
        res = [1] * n

        # 1. Build prefix array (products of elements to the left)
        pref = 1
        for i in range(n):
            prefix[i] = pref
            pref *= nums[i]

        # 2. Build postfix array (products of elements to the right)
        post = 1
        for i in range(n - 1, -1, -1):
            postfix[i] = post
            post *= nums[i]

        # 3. Combine prefix and postfix products
        for i in range(n):
            res[i] = prefix[i] * postfix[i]

        return res