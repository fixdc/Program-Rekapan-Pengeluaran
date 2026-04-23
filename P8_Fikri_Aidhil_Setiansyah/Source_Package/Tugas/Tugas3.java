package Source_Package.Tugas;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        Double nilai;
        Double total_nilai = 0.0;
        Double means = 0.0;

        System.out.println("Program Input Nilai Mahasiswa");

        do {
            System.out.println("Masukan Nilai Mahasiswa  : ");
            nilai = input.nextDouble();

            total_nilai += nilai;

            System.out.println("Nilai Mahasiswa : " + nilai);

            System.out.println("Ulangi (y/t)");
            ulang = input.next().charAt(0);
            input.nextLine();

            means = means + 1;

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Total Nilai Mahasiswa : " + total_nilai);
        System.out.println("Rata-rata Nilai Mahasiswa : " + total_nilai/means);

        input.close();
    }
}
