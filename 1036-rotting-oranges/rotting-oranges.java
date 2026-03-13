class Solution {
    public int orangesRotting(int[][] grid) {

        Queue<int[]> queue = new LinkedList<>();
        
        int row = grid.length;
        int col = grid[0].length ; 
        int fresh = 0 ; 

        for(int i = 0 ; i<row ; i++){
            for(int j  = 0 ; j<col ; j++){

                if(grid[i][j]==2) queue.offer(new int[] {i,j});

                if(grid[i][j] == 1) fresh++;
            }
        }

        int min = 0 ; 
        int[][] dirs = {{1,0}, {-1,0},{0,1},{0,-1}};

        while(!queue.isEmpty() && fresh>0){

            int size = queue.size();
            min++;

            for(int i = 0 ; i<size; i++){
                int[] cell = queue.poll();

                int r = cell[0] , c = cell[1];
                
        for (int[] d : dirs) {
          int nr = r + d[0], nc = c + d[1];
          if (nr >= 0 && nr < row &&
              nc >= 0 && nc < col &&
              grid[nr][nc] == 1) {
            grid[nr][nc] = 2; // sadne laga
            fresh--; // fresh kam hua
            queue.offer(new int[]{nr, nc});
          }
        }

            }
        }

     
     return fresh == 0 ? min : -1;
        
    }
}