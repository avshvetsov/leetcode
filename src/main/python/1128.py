import unittest
from parameterized import parameterized

class Solution(object):
    def numEquivDominoPairs(self, dominoes):
        """
        :type dominoes: List[List[int]]
        :rtype: int
        """
        print(dominoes)
        return 0


class SolutionTest(unittest.TestCase):
    @parameterized.expand([
        [[[1,2],[2,1],[3,4],[5,6]], 1],
        [[[1,2],[1,2],[1,1],[1,2],[2,2]], 3],
    ])
    def test(self, n, exp):
        s = Solution()
        act_n = s.numEquivDominoPairs(n)
        self.assertEqual(exp, act_n)
