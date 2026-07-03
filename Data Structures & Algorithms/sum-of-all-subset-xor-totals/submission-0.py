from typing import List

class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        result = 0  # This holds our running grand total

        def backtrack(index, current):
            nonlocal result  # 1. FIX: Allows us to modify the 'result' variable above
            
            if index == len(nums):
                result += current
                return

            # Choice 1: Include the element
            backtrack(index + 1, current ^ nums[index])
            # Choice 2: Exclude the element
            backtrack(index + 1, current)

        backtrack(0, 0)
        return result  # 2. FIX: Return 'result' instead of 'total'
