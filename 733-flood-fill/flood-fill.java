class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int oldcolor = image[sr][sc];

        if(color == oldcolor){
            return image ;
        }
        fill(image , sr , sc , oldcolor , color);
        return image;
    }

    public void fill(int[][] image , int r , int c , int color , int newcolor){

        if(r<0 || r>=image.length || c <0 || c >=image[0].length || image[r][c]!=color){
            return;
        }

        image[r][c] = newcolor; 

        fill(image , r +1,c , color , newcolor);
        fill(image , r -1, c, color , newcolor);
        fill(image , r , c-1, color , newcolor);
        fill(image , r, c+1 , color , newcolor);
    }
}