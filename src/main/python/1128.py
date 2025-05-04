import unittest
from parameterized import parameterized


class Solution(object):
    def numEquivDominoPairs(self, dominoes):
        """
        :type dominoes: List[List[int]]
        :rtype: int
        """
        res = 0
        map = {}
        for a, b in dominoes:
            if b < a:
                t = a
                a = b
                b = t
            if a in map:
                if b in map[a]:
                    res = res + map[a][b]
                    map[a][b] = map[a][b] + 1
                    continue
                else:
                    map[a][b] = 0
            else:
                map[a] = {b : 0}

            map[a][b] = map[a][b] + 1
        return res

class SolutionTest(unittest.TestCase):
        @parameterized.expand([
            [[[1, 2], [2, 1], [3, 4], [5, 6]], 1],
            [[[1, 2], [1, 2], [1, 1], [1, 2], [2, 2]], 3],
        ])
        def test(self, n, exp):
            s = Solution()
            act_n = s.numEquivDominoPairs(n)
            self.assertEqual(exp, act_n)
