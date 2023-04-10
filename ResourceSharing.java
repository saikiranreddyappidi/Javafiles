package DeadLock;

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
        int[][] maximum = {{7, 5, 3}, {3, 2, 2}, {9, 0, 2}, {2, 2, 2}, {4, 3, 3}};
        int[][] allocation = {{0, 1, 0}, {2, 0, 0}, {3, 0, 2}, {2, 1, 1}, {0, 0, 2}};
        int[] available = {3, 3, 2};

        BankerAlgorithm banker = new BankerAlgorithm(maximum, allocation, available);
        banker.isSafeState();
    }
}

