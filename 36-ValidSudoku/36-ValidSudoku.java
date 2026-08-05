// Last updated: 8/5/2026, 9:57:44 AM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        boolean[][] rows = new boolean[9][9];
4        boolean[][] cols = new boolean[9][9];
5        boolean[][] boxes = new boolean[9][9];
6
7        for (int i = 0; i < 9; i++) {
8            for (int j = 0; j < 9; j++) {
9                if (board[i][j] != '.') {
10                    int num = board[i][j] - '1';
11                    int boxIndex = (i / 3) * 3 + (j / 3);
12
13                    if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
14                        return false;
15                    }
16
17                    rows[i][num] = cols[j][num] = boxes[boxIndex][num] = true;
18                }
19            }
20        }
21        return true;
22    }
23}