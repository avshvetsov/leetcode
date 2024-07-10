from typing import List


class Solution:
    def minOperations(self, logs: List[str]) -> int:
        """
        :type logs: List[str]
        :rtype: int
        """
        depth = 0
        for log in logs:
            if log == "../":
                depth = depth - 1 if depth > 0 else 0
            elif log == "./":
                pass
            else:
                depth = depth + 1
        return depth


solution = Solution()
print(solution.minOperations(["d1/", "d2/", "../", "d21/", "./"]))
print(solution.minOperations(["d1/", "d2/", "./", "d3/", "../", "d31/"]))
print(solution.minOperations(["d1/", "../", "../", "../"]))
