class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        result=[]
        

        def backtrack(index,current_ele):
            if index==len(nums):
                result.append(current_ele[:])
                return

            current_ele.append(nums[index])
            backtrack(index+1,current_ele)

            current_ele.pop()
            backtrack(index+1,current_ele)

        backtrack(0,[])
        return result
