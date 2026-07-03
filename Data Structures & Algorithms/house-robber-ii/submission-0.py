class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums)==1:
            return nums[0]

        def robline(arr):
            p1=0
            p2=0

            for num in arr:
                curr = max(p1,p2+num)
                p2=p1
                p1=curr
            return p1

        return max(robline(nums[:-1]),robline(nums[1:]))