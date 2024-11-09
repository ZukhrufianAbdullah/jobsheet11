import java.util.Scanner;

public class LatihanArray226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int question[][] = new int[10][6];
        double rataRespon;
        double rataTotal = 0;
        double[] rataPertanyaan = new double[question[0].length];

        for (int i = 0; i < question.length; i++) {
            System.out.printf("Responden ke-%d\n", i + 1);
            for (int j = 0; j < question[i].length; ) {
                System.out.printf("Pertanyaan %d [1-5]: ", j + 1);
                question[i][j] = sc.nextInt();

                if (question[i][j] < 1 || question[i][j] > 5) {
                    System.out.println("Masukkan jawaban yang benar [1-5]");
                } else {
                    j++;
                }
            }
        }

        System.out.println();
        System.out.println("================================");
        System.out.println("|          Rata-rata           |");
        System.out.println("================================");

        for (int i = 0; i < question.length; i++) {
            System.out.printf("Responden %d: ", i + 1);
            rataRespon = 0;
            for (int j = 0; j < question[i].length; j++) {
                rataRespon += question[i][j];
                rataPertanyaan[j] += question[i][j];
            }
            rataRespon /= question[i].length;
            System.out.printf("%.2f\n", rataRespon);
            rataTotal += rataRespon;
        }

        System.out.printf("Rata-rata keseluruhan: %.2f\n", rataTotal / question.length);

        for (int j = 0; j < rataPertanyaan.length; j++) {
            rataPertanyaan[j] /= question.length;
            System.out.printf("Rata-rata soal ke-%d: %.2f\n", j + 1, rataPertanyaan[j]);
        }
    }
}
