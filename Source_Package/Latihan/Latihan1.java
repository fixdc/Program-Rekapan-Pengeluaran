import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args){
        Float kehadiran, b_kehadiran;
        Float tugas, b_tugas;
        Float uts, b_uts;
        Float uas, b_uas;
        Float total;
        int real;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Realisasi");
        real = input.nextInt();
        System.out.println("Masukan Jumlah Kehadiran");
        kehadiran = input.nextFloat();
        System.out.println("Masukan Nilai Tugas");
        tugas = input.nextFloat();
        System.out.println("Masukan Nilai UTS");
        uts = input.nextFloat();
        System.out.println("Masukan Nilai UAS");
        uas = input.nextFloat();

        b_kehadiran = kehadiran/real * 10;
        b_tugas = tugas/100 * 20;
        b_uts = uts/100 * 30;
        b_uas = uas/100 * 40;

        total = b_kehadiran+b_tugas+b_uas+b_uts;

        System.out.println("Jumlah Kehadiran :" + kehadiran +"/" + real + " Bobot :" + b_kehadiran);
        System.out.println("Nilai Tugas :" + tugas);
        System.out.println("Nilai Uts :" + uts);
        System.out.println("Nilai Uas :" + uas);
        System.out.println("Total nilai keseluruhan :" + total);

        input.close();

    }
}