import unittest

from parameterized import parameterized


class Solution(object):
    def threeConsecutiveOdds(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        countrer = 0
        for e in arr:
            countrer = countrer + 1 if e % 2 == 1 else 0
            if countrer == 3:
                return True
        return False


class SolutionTest(unittest.TestCase):
    @parameterized.expand([
        [[2, 6, 4, 1], False],
        [[1, 2, 34, 3, 4, 5, 7, 23, 12], True],
    ])
    def test(self, input, exp):
        s = Solution()
        act_n = s.threeConsecutiveOdds(input)
        self.assertEqual(exp, act_n)
