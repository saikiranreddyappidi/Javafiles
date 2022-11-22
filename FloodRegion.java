import java.util.Scanner;

class FloodFill{
    int sr;
    int sc;
    int [][]arr;
    int k=-1,existing_value;
    FloodFill(int [][]arr,int sr,int sc,int k){
        this.arr=arr;
        this.sr=sr;
        this.sc=sc;
        this.k=k;
        this.existing_value=arr[sr][sc];
        fill(sr,sc);
        CoveredRegion(arr);
    }
    void fill(int x,int y){
        if(x<arr.length && x>=0 && y>=0 && y<arr[x].length){
//            System.out.println(x+" "+y+"="+arr[x][y]);
            if(arr[x][y]==existing_value){
                arr[x][y]=k;
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
    void CoveredRegion(int [][]arr){
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of rows and columns of the matrix: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Enter the values for "+x+" rows and "+y+" columns.");
        int [][]arr=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the location of cell: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Enter the number to replace: ");
        int k=sc.nextInt();
        System.out.println("New matrix : ");
        new FloodFill(arr,a,b,k);
    }
}
