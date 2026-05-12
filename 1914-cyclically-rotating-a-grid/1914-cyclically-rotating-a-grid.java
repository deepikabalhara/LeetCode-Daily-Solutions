class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int t=0 ,l=0;
        int b = grid.length-1 , R=grid[0].length-1;

        while(t<b && l<R){
            int len=b-t , wid=R-l;
            int perimeter =2*len+2*wid;
            int r=k% perimeter;

            while(r-- > 0){
                int tmp = grid[t][l];
                for(int i=l;i<R;i++)
                    grid[t][i]=grid[t][i+1];
                for(int i=t;i<b;i++)
                    grid[i][R]=grid[i+1][R];
                for(int i=R;i>l;i--)
                    grid[b][i]=grid[b][i-1];
                for(int i=b;i>t;i--)
                    grid[i][l]=grid[i-1][l];
                grid[t+1][l]=tmp;

                
            }
            t++;l++;
            b--;R--;
        }
        return grid;
    }
}