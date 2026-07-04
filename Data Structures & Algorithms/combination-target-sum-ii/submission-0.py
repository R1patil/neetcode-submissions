class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        candidates.sort()
        result = []

        def backtrack(index, current_list, current_sum):
            if current_sum == target:
                result.append(current_list[:])
                return
            if index == len(candidates) or current_sum > target:
                return

            # Include candidates[index]
            current_list.append(candidates[index])
            backtrack(index + 1, current_list, current_sum + candidates[index])
            current_list.pop()

            # Skip duplicates and exclude candidates[index]
            next_index = index + 1
            while next_index < len(candidates) and candidates[next_index] == candidates[index]:
                next_index += 1
            backtrack(next_index, current_list, current_sum)

        backtrack(0, [], 0)
        return result
