import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] data = new int[6][10];
        double[] rataPer = new double[6];
        double[] rataRes = new double[10];

        int total = 0, totalPer = 0, totalRes = 0;
        double rata = 0;

        for (int i = 0; i < data.length; i++) {
            System.out.println("Input data dari pertanyaan ke-" + (i+1) + ": ");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Input data dari responden ke-" + (j+1) + ": ");
                int nilai;
                nilai = sc.nextInt();
                if(nilai < 1 || nilai > 5) {
                    j--;
                    continue;
                }
                data[i][j] = nilai;
            }
        }

        for(int i=0;i<data.length;i++) {
            totalPer = 0;
            for(int j=0;j<data[0].length;j++) {
                totalPer += data[i][j];
            }
            rata = totalPer / data[0].length;
            rataPer[i] = rata;
        }

        for(int i=0;i<data[0].length;i++) {
            totalRes = 0;
            for(int j=0;j<data.length;j++) {
                totalRes += data[j][i];
            }
            rata = totalRes / data.length;
            rataRes[i] = rata;
        }
        total = 0;
        for(int i=0;i<data.length;i++) {
            for(int j=0;j<data[0].length;j++) {
                total += data[i][j];
            }
        }
        double rataTotal = total / (data.length * data[0].length);


        for(int i=0;i<data.length;i++) {
            System.out.println("Rata-rata pertanyaan ke-" + (i+1) + ": " + rataPer[i]);
        }
        for(int i=0;i<data[0].length;i++) {
            System.out.println("Rata-rata responden ke-" + (i+1) + ": " + rataRes[i]);
        }
        System.out.println("Rata-rata keseluruhan: " + rataTotal);
    }
}
