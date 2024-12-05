package ukl2024;

import java.util.Scanner;


public class Soal_3 {
    
   public static void main(String[] args) {
   
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
       
       
   }     
}
