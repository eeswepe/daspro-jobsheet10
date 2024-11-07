import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom, pilihanMenu;
        System.out.println("========================================================");
        System.out.println("Menu Aplikasi:");
        System.out.println("1. Input penonton");
        System.out.println("2. Lihat penonton");
        System.out.println("3. Exit");        
        
        do {
            System.out.println("========================================================");
            System.out.print("Masukkan pilihan menu: ");
            pilihanMenu = sc.nextInt();
            System.out.println("========================================================");
            sc.nextLine();

            switch (pilihanMenu) {
                case 1:
                    while(true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
            
                        if((baris > 0 && baris <= penonton.length) && (kolom > 0 && kolom <= penonton[0].length)) {
                            if(penonton[baris-1][kolom-1] == null) {
                                penonton[baris-1][kolom-1] = nama;
                            } else {
                                System.out.println("Kursi sudah terisi oleh penonton lainnya. Silakan coba lagi.");
                                continue;
                            }
                        } else {
                            System.out.println("Nomor baris/kolom tidak tersedia. Silakan coba lagi.");
                            continue;
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.next();
            
                        if(next.equalsIgnoreCase("n")) {
                            break;
                        }
                        System.out.println();
                        sc.nextLine();
                    }
                    break;
                case 2:
                    for(int i=0;i<penonton.length;i++) {
                        for(int j=0;j<penonton[i].length;j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("*** ");
                            } else {
                                System.out.print(penonton[i][j] + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    break;
            }
        } while (pilihanMenu != 3);
    }
}
