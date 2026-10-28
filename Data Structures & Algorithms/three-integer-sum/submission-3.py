class Solution:

    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()  # 1. Essential for two-pointer logic
        ans = []

        for i in range(len(nums) - 2):
            # Skip duplicate values for the first element
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            start = i + 1
            end = len(nums) - 1

            while start < end:
                total = nums[i] + nums[start] + nums[end]

                if total > 0:
                    end -= 1
                elif total < 0:
                    start += 1
                else:
                    ans.append([nums[i], nums[start], nums[end]])
                    start += 1
                    end -= 1

                    # Skip duplicate values for the second element
                    while start < end and nums[start] == nums[start - 1]:
                        start += 1

                    while start < end and nums[end] == nums[end + 1]:
                        end -= 1

        return ans