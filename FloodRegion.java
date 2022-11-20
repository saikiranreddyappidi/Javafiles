class FloodFill{
    int sr;
    int sc;
    int [][]arr;
    int k=1;
    FloodFill(int [][]arr,int sr,int sc){
        this.arr=arr;
        this.sr=sr;
        this.sc=sc;
        fill(sr,sc);
        CoveredRegion();
    }
    void fill(int x,int y){
        if(x<4 && x>=0 && y>=0 && y<4){
//            System.out.println(x+" "+y+"="+arr[x][y]);
            if(arr[x][y]==1){
                arr[x][y]=0;
                fill(x,y+1);
                fill(x,y-1);
                fill(x+1,y);
                fill(x-1,y);
            }
//            else{
//                arr[x][y]=0;
//            }
        }
    }
    void CoveredRegion(){
        for(int[] i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

public class FloodRegion {
    public static void main(String []args){
        int [][]arr = {{1,1,1,2},{1,1,1,1},{1,2,1,1},{1,1,2,1}};
        for(int[] i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("New: ");
        new FloodFill(arr,1,1);
    }
}
