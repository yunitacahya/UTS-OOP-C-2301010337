package bukunovel;

import java.util.Scanner;

/**
 *
 * @author Yunita Cahya
 * TGL 10 MEI 2025
 */
public class NovelManager {
    static Scanner input = new Scanner(System.in);
    static Novel[] daftarNovel = new Novel[100];
    static int jumlahNovel = 0;

    public static void tambahNovel() {
        System.out.print("Masukkan Judul Novel : ");
        String judul = input.nextLine();
        System.out.print("Masukkan Nama Penulis: ");
        String penulis = input.nextLine();
        System.out.print("Masukkan Tahun Terbit: ");
        int tahun = input.nextInt();
        input.nextLine(); // clear buffer

        daftarNovel[jumlahNovel] = new Novel(judul, penulis, tahun);
        jumlahNovel++;
        System.out.println("Novel berhasil ditambahkan!\n");
    }

    public static void tampilkanNovel() {
        if (jumlahNovel == 0) {
            System.out.println("Belum ada data novel.\n");
        } else {
            for (int i = 0; i < jumlahNovel; i++) {
                System.out.println("Data ke-" + (i+1));
                daftarNovel[i].tampilkanInfo();
            }
        }
    }

    public static void ubahNovel() {
        tampilkanNovel();
        if (jumlahNovel == 0) return;

        System.out.print("Pilih nomor data yang ingin diubah: ");
        int index = input.nextInt();
        input.nextLine();

        if (index > 0 && index <= jumlahNovel) {
            System.out.print("Masukkan Judul Baru    : ");
            String judul = input.nextLine();
            System.out.print("Masukkan Penulis Baru  : ");
            String penulis = input.nextLine();
            System.out.print("Masukkan Tahun Terbit  : ");
            int tahun = input.nextInt();
            input.nextLine();

            daftarNovel[index-1] = new Novel(judul, penulis, tahun);
            System.out.println("Data berhasil diubah.\n");
        } else {
            System.out.println("Nomor data tidak valid.\n");
        }
    }

    public static void hapusNovel() {
        tampilkanNovel();
        if (jumlahNovel == 0) return;

        System.out.print("Pilih nomor data yang ingin dihapus: ");
        int index = input.nextInt();
        input.nextLine();

        if (index > 0 && index <= jumlahNovel) {
            for (int i = index-1; i < jumlahNovel-1; i++) {
                daftarNovel[i] = daftarNovel[i+1];
            }
            daftarNovel[jumlahNovel-1] = null;
            jumlahNovel--;
            System.out.println("Data berhasil dihapus.\n");
        } else {
            System.out.println("Nomor data tidak valid.\n");
        }
    }
}
