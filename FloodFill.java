public class FloodFill{
    public static void main(String[] args) {
        System.out.println("FloodFill...");
        int grid[][] = {
            {0,0,1,1,1,1,3,3,3,0},
            {0,1,1,0,0,0,0,3,2,2},
            {0,0,0,2,2,2,3,2,1,0},
            {0,1,1,2,2,1,1,3,1,0},
            {0,1,1,1,2,1,0,3,1,2},
            {1,0,0,2,2,0,0,0,0,0},
            {1,1,0,0,2,2,0,0,0,0},
            {1,0,0,2,2,2,0,1,0,2},
            {1,0,1,1,0,0,0,1,1,2},
            {1,0,1,1,1,0,1,2,2,2}
        };

        fillColor(grid,3,4,2,5);
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }


    


    private static void fillColor(int a[][], int x, int y, int oldColor, int newColor){
        if(x <1 || x>9 || y< 1 || y>9)
            return;

        if(a[x][y] != oldColor)
            return;
        
        a[x][y] = newColor;
        fillColor(a, x-1,y,oldColor,newColor);
        fillColor(a, x+1,y,oldColor,newColor);
        fillColor(a, x,y-1,oldColor,newColor);
        fillColor(a, x,y+1,oldColor,newColor);
        
    }
}