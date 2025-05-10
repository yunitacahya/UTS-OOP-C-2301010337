package bukunovel;

import java.util.Scanner;

/**
 *
 * @author Yunita Cahya
 * TGL 10 MEI 2025
 */
public class BukuNovel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===== Aplikasi Manajemen Buku Novel =====");
            System.out.println("1. Tambah Data Novel");
            System.out.println("2. Tampilkan Data Novel");
            System.out.println("3. Ubah Data Novel");
            System.out.println("4. Hapus Data Novel");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // clear buffer

            switch (pilihan) {
                case 1:
                    NovelManager.tambahNovel();
                    break;
                case 2:
                    NovelManager.tampilkanNovel();
                    break;
                case 3:
                    NovelManager.ubahNovel();
                    break;
                case 4:
                    NovelManager.hapusNovel();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.\n");
            }
        } while (pilihan != 5);
    }
    
}
