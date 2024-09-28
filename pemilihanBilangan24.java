import java.util.Scanner;
/**
 * pemilihanBilangan24
 */
public class pemilihanBilangan24 {

    public static void main(String[] args) {
        Scanner PB1 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = PB1.nextInt();

        String hasil;

        hasil = (angka % 2 == 0) ? " bilangan ganjil" : " bilangan genap";
        System.out.println(angka + " Adalah" + hasil);
    }
}