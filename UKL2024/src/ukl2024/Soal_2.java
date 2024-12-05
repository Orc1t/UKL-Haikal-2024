package ukl2024;

public class Soal_2 {

    public static void main(String[] args) {

        int tabunganAwal = 100000; 
        int kenaikanPerBulan = 20000; 

        System.out.println("Jumlah Tabungan Setiap Bulan:");

        for (int bulan = 1; bulan <= 24; bulan++) {
            int tabunganBulanIni = tabunganAwal + (bulan - 1) * kenaikanPerBulan;
            System.out.printf("Bulan ke-%d: Rp%,d\n", bulan, tabunganBulanIni);
        }

        int totalTabungan = hitungTotalTabungan(24, tabunganAwal, kenaikanPerBulan);
        System.out.printf("\nTotal Tabungan Setelah 24 Bulan: Rp%,d\n", totalTabungan);
    }

    public static int hitungTotalTabungan(int jumlahBulan, int tabunganAwal, int kenaikanPerBulan) {
        int totalTabungan = 0;

        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {
            totalTabungan += tabunganAwal + (bulan - 1) * kenaikanPerBulan;
        }
        return totalTabungan;

    }
}
