// Last updated: 7/9/2026, 10:13:25 AM
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] != 0) return -1;
        int n = grid.length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0,1}); //(i,j,steps)
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0},{1,1},{-1,-1},{1,-1},{-1,1}};
        grid[0][0] = -1;
        int min_steps = -1;
        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            int i = temp[0],j = temp[1], steps = temp[2];
            if(i == n-1 && j == n-1) return steps;
            for(int[] dir: dirs){
                int ni = i + dir[0],nj = j + dir[1];
                if(ni >=0 && ni < n && nj >=0 && nj <n && grid[ni][nj] == 0){
                    queue.add(new int[]{ni,nj,steps + 1});
                    grid[ni][nj] = -1;
                }
            }
        }
        return min_steps;
    }
}