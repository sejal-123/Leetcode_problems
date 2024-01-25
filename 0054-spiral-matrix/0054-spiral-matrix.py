class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        row = len(matrix)
        column = len(matrix[0])
        length = row * column
        row_1 = 0
        column_1 = 0
        i = 0
        j = 0
        ans = []
        print(row * column)
        while len(ans) < (length):
            print(len(ans))
            while j < column and len(ans) < (length):
                print(i, j)
                ans.append(matrix[i][j])
                j += 1
            column -= 1
            j -= 1
            i += 1
            while i < row and len(ans) < (length):
                print(i, j)
                ans.append(matrix[i][j])
                i += 1
            row -= 1
            i -= 1
            j -= 1
            while j >= column_1 and len(ans) < (length):
                print(i, j)
                ans.append(matrix[i][j])
                j -= 1
            column_1 += 1
            j += 1
            i -= 1
            while i > row_1 and len(ans) < (length):
                print(i, j)
                ans.append(matrix[i][j])
                i -= 1
            row_1 += 1
            i += 1
            j += 1
            print(len(ans))
        return ans
