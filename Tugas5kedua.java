import java.util.Scanner;
public class Tugas5kedua {
    public static void main(String[] args) {
        Scanner T5K = new Scanner(System.in);
        int usia;
        String kategori;

        System.out.print("Masukkan Usia : ");
        usia = T5K.nextInt();

        if (usia >= 0 && usia <= 12) {
            System.out.println("Kategori: Anak");
        } else if (usia >= 13 && usia <= 19) {
            System.out.println("Kategori: Remaja");
        } else if (usia >= 20 && usia <= 64) {
            System.out.println("Kategori: Dewasa");
        } else if (usia >= 65) {
            System.out.println("Kategori: Lansia");
        }

    }
    
}
