package ukl2024;

import java.util.Scanner;

public class UKL2024 {

    public static void main(String[] args) {

        //No.3 = 1
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        int[] kehadiran = new int[jumlahSiswa];
        int totalKehadiran = 0;
        int jumlahHariKerja = 24; 

       
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
            kehadiran[i] = scanner.nextInt();
            totalKehadiran += kehadiran[i];
        }

       
        double rataRataKehadiran = (double) totalKehadiran / jumlahSiswa;

       
        System.out.println("\nRekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari Kerja: " + jumlahHariKerja + " Hari):");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + kehadiran[i] + " hari hadir");
        }

        System.out.printf("\nRata-rata kehadiran siswa: %.2f hari \n", rataRataKehadiran);

        
        System.out.println("\nKesimpulan:");
        System.out.println("Siswa yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] > rataRataKehadiran) {
                System.out.println("Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
        }

        System.out.println("\nSiswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] < rataRataKehadiran) {
                System.out.println("Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
        }
        
        scanner.close();


        //No.2 = 1
//        int tabunganAwal = 100000; 
//        int kenaikanPerBulan = 20000; 
//        int totalTabungan = 0; 
//
//        System.out.println("Jumlah Tabungan Setiap Bulan:");
//        
//        for (int bulan = 1; bulan <= 24; bulan++) {
//            int tabunganBulanIni = tabunganAwal + (bulan - 1) * kenaikanPerBulan;
//            System.out.printf("Bulan ke-%d: Rp%,d\n", bulan, tabunganBulanIni);
//            totalTabungan += tabunganBulanIni; 
//        }
//
//        System.out.printf("\nTotal Tabungan Setelah 24 Bulan: Rp%,d\n", totalTabungan);



        //No.1 = 3
//        String[] kalimat = {
//            "saya anak moklet",
//            "saya anak wikusama",
//            "saya angkatan 33"
//        };
//
//        for (int i = 50; i > 0; i--) 
//            if (i == 1) {
//                System.out.println(i + ". saya senang");
//            } else if (i % 3 == 0) {
//                System.out.println(i + ". " + kalimat[2]); 
//            } else if (i % 2 == 0) {
//                System.out.println(i + ". " + kalimat[0]); 
//            } else {
//                System.out.println(i + ". " + kalimat[1]); 
//            }
        }

    }


