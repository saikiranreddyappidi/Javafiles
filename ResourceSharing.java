import java.util.*;

class BankerAlgorithm {
    int[][] maximum;
    int[][] allocation;
    int[] available;
    int[] work;
    boolean[] finish;

    public BankerAlgorithm(int[][] maximum, int[][] allocation, int[] available) {
        this.maximum = maximum;
        this.allocation = allocation;
        this.available = available;
        this.work = new int[available.length];
        this.finish = new boolean[maximum.length];

        System.arraycopy(available, 0, work, 0, available.length);
    }

    public void isSafeState() {
        int[] safeSequence = new int[maximum.length];
        int count = 0;

        while (count < maximum.length) {
            boolean found = false;

            for (int i = 0; i < maximum.length; i++) {
                if (!finish[i]) {
                    boolean canFinish = true;

                    for (int j = 0; j < available.length; j++) {
                        if (maximum[i][j] - allocation[i][j] > work[j]) {
                            canFinish = false;
                            break;
                        }
                    }

                    if (canFinish) {
                        for (int j = 0; j < available.length; j++) {
                            work[j] += allocation[i][j];
                        }

                        finish[i] = true;

                        safeSequence[count++] = i;

                        found = true;
                    }
                }
            }

            if (!found) {
                return;
            }
        }

        System.out.print("Safe sequence: ");
        for (int j : safeSequence) {
            System.out.print("P" + j + " ");
        }
        System.out.println();

    }
}

public class ResourceSharing {
    public static void main(String[] args) {
	//No.of resources of Type A=10,B=5,C=7
	Scanner sc=new Scanner(System.in);
	int r,c;
	System.out.println("Enter the no.of rows and columns: ");
	r=sc.nextInt();
	c=sc.nextInt();
	int[][] maximum = new int[r][c];
        int[][] allocation = new int[r][c];
	System.out.println("Enter the maximum resources needed for each process: ");
	for(int i=0;i<r;i++)
		for(int j=0;j<c;j++)
			maximum[i][j]=sc.nextInt();
	System.out.println("Enter the allocated resources for each process: ");
        for(int i=0;i<r;i++)
		for(int j=0;j<c;j++)
			allocation[i][j]=sc.nextInt();
	int p=0,q=0,s=0;	
	for(int i=0;i<r;i++){
		p+=allocation[i][0];
		q+=allocation[i][1];
		s+=allocation[i][2];
	}
        int[] available = {10-p, 5-q, 7-s};
	System.out.println("Maximum Instances of each type required:\nProcess\tType-A\tType-B\tType-C");
	for(int i=0;i<r;i++){
		System.out.print("P"+i+"\t");
		for(int j=0;j<c;j++){
			System.out.print(maximum[i][j]+"\t");
		}
		System.out.println();
	}
	System.out.println("Allocated Instances of each type for each process:\nProcess\tType-A\tType-B\tType-C");
	for(int i=0;i<r;i++){
		System.out.print("P"+i+"\t");
		for(int j=0;j<c;j++){
			System.out.print(maximum[i][j]+"\t");
		}
		System.out.println();
	}
	System.out.println("Avilable: \nA\tB\tC");
	System.out.println(available[0]+"\t"+available[1]+"\t"+available[2]);
        BankerAlgorithm banker = new BankerAlgorithm(maximum, allocation, available);
        banker.isSafeState();
    }
}
