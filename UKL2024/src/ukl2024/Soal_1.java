package ukl2024;


public class Soal_1 {
    
  public static void main(String[] args) {
  
  
  String[] kalimat = {
            "saya anak moklet",
            "saya anak wikusama",
            "saya angkatan 33"
        };

        for (int i = 50; i > 0; i--) 
            if (i == 1) {
                System.out.println(i + ". saya senang");
            } else if (i % 3 == 0) {
                System.out.println(i + ". " + kalimat[2]); 
            } else if (i % 2 == 0) {
                System.out.println(i + ". " + kalimat[0]); 
            } else {
                System.out.println(i + ". " + kalimat[1]); 
            }
  
  }    
}
