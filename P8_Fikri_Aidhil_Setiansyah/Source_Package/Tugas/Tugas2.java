package Source_Package.Tugas;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        int nilai;
        int total_nilai = 0;

        System.out.println("Program Input Nilai Mahasiswa");

        do {
            System.out.println("Masukan Nilai Mahasiswa  : ");
            nilai = input.nextInt();

            total_nilai += nilai;

            System.out.println("Nilai Mahasiswa : " + nilai);

            System.out.println("Ulangi (y/t)");
            ulang = input.next().charAt(0);
            input.nextLine();

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Total Nilai Mahasiswa : " + total_nilai);

        input.close();
    }
}
