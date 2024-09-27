import java.util.Scanner;
/**
 * pemilihanBilangan24
 */
public class pemilihanBilangan24 {

    public static void main(String[] args) {
        Scanner PB1 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = PB1.nextInt();

        if (angka % 2 == 0)
           System.out.println("Angka "+angka+" bilangan genap");
        else
           System.out.println("Angka "+angka+" bilangan ganjil");
    }
}