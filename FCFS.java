public class FCFS {

    static void WT(int process[], int n, int wt[], int bt[]) {
        wt[0] = 0;
        for (int i = 1; i < n; i++) {
            wt[i] = bt[i - 1] + wt[i - 1];
        }
    }

    static void TAT(int process[], int n, int wt[], int bt[], int tat[]) {
        for (int i = 0; i < n; i++) {
            tat[i] = bt[i] + wt[i];
        }
    }

    void AVG(int process[], int n, int bt[]) {
        int wt[] = new int[n];
        int tat[] = new int[n];
        int totalwt = 0;
        int totaltat = 0;
        WT(process, n, wt, bt);
        TAT(process, n, wt, bt, tat);
        System.out.println("P\tBT\t\tWT\t\t\tTAT");
        for (int i = 0; i < n; i++) {
            totalwt = totalwt + wt[i];
            totaltat = totaltat + tat[i];
            System.out.print((i + 1));
            System.out.print("\t" + bt[i]);
            System.out.print(" \t\t" + wt[i]);
            System.out.println(" \t\t\t" + tat[i]);
        }
        double averwt = totalwt / n;
        double avrgtat = totaltat / n;
        System.out.println("Average waiting time is: " + averwt);
        System.out.println("Average Turn around time is: " + avrgtat);
    }

    public static void main(String[] args) {
        int process[] = { 1, 2, 3 };
        int n = 3;
        int bt[] = { 10, 5, 8 };
        FCFS obj = new FCFS();
        obj.AVG(process, n, bt);

    }
}
