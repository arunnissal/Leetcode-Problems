// Last updated: 7/9/2026, 10:13:49 AM
class Solution {
    static int dir[][] = {{0,-1},{0,1},{-1,0},{1,0}};
    
    void dfs(int[][] image,int row,int col,int ocr,int color){
        image[row][col]=color;
        for(int i=0;i<4;i++){
                int nr = row + dir[i][0];
                int nc = col + dir[i][1];

                // boundary check
                if(nr >= 0 && nr < image.length && nc >= 0 && nc < image[0].length){
                    if(image[nr][nc]==ocr){
                      dfs(image,nr,nc,ocr,color);
                    }
                }

            }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)return image;
        int m=image.length;
        int n=image[0].length;
        int cr=image[sr][sc];
        image[sr][sc]=color;
        dfs(image,sr,sc,cr,color);
        
        return image;

    }
}