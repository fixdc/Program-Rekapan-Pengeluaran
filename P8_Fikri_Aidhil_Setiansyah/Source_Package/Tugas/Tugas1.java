package Source_Package.Tugas;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        System.out.println("Program Input Nilai Mahasiswa");

        do {
            System.out.println("Masukan Nilai Mahasiswa : ");
            int nilai = input.nextInt();

            System.out.println("Nilai Mahasiswa : " + nilai);

            System.out.println("Ulangi (y/t)");
            ulang = input.next().charAt(0);
            input.nextLine();

        } while (ulang == 'y' || ulang == 'Y');

        input.close();
    }
}
