import java.util.Scanner;

public class Siakad24Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas;
        byte absen;
        double nilaiKuis = 0.2, nilaiTugas = 0.15, nilaiUts = 0.3, nilaiUas = 0.35, NilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUas = sc.nextDouble();

        NilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUts * 0.3) + (nilaiUas * 0.35);
        
        System.out.println("Nama: " + nama + "NIM: " + nim);
        System.out.println("Kelas: " + kelas + "Absen: " + absen);
        //System.out.println(String.format("Mahasiswa dengan nama %s (NIM %s) kelas %s nomor absen %d", nama, nim, kelas, absen));
        System.out.println("Nilai Akhir: " + NilaiAkhir);

        String nilaiHuruf, kualifikasi;
        

        if (NilaiAkhir >=85){
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (NilaiAkhir >= 80){
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (NilaiAkhir >= 73){
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (NilaiAkhir >= 65){
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (NilaiAkhir >= 60){
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (NilaiAkhir >= 50){
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }
        
        System.out.println("Nilai Akhir Huruf: "+ nilaiHuruf);
        System.out.println("Kualifikasi: "+ kualifikasi);

    }
}
