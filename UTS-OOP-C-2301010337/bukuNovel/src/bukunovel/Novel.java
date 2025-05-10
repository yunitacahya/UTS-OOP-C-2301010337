package bukunovel;

/**
 *
 * @author Yunita Cahya
 * TGL 10 MEI 2025
 */
class Novel {
    String judul;
    String penulis;
    int tahunTerbit;

    public Novel(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanInfo() {
        System.out.println("Judul      : " + judul);
        System.out.println("Penulis    : " + penulis);
        System.out.println("Tahun      : " + tahunTerbit);
        System.out.println("-----------------------------");
    }
}
