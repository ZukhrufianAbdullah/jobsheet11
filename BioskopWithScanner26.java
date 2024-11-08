import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom,menu = 0;
        String nama, next;
        String[][] penonton = new String[4][2];
        
        while (true) {
            menu = 0;
            System.out.println("=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu){
                case 1:
                System.out.println("=======================");
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor baris atau kolom tidak tersedia. Silakan masukkan ulang.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Silakan pilih kursi lain.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Kursi berhasil dipesan untuk " + nama + " di Baris " + baris + ", Kolom " + kolom + ".");
                            break;
                        }
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Daftar penonton");
                    System.out.println("======================");
                    for (int i = 0; i < penonton.length; i++){
                        for (int j = 0; j < penonton[i].length; j++){
                            System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + ": " + (penonton[i][j] != null ? penonton[i][j] : "***"));
                        }
                    }
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }
}
