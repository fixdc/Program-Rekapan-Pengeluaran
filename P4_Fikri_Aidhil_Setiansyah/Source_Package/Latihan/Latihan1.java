import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float kehadiran, tugas, uts, uas, realisasi;
        float b_kehadiran,b_tugas,b_uts,b_uas, total;

        System.out.println("Masukan jumlah kehadiran: ");
        kehadiran = input.nextFloat();
        System.out.println("Masukan kehadiran realisasi: ");
        realisasi = input.nextFloat();
        System.out.println("Masukan nilai tugas: ");
        tugas = input.nextFloat();
        System.out.println("Masukan nilai UTS: ");
        uts  = input.nextFloat();
        System.out.println("Masukan nilai UAS: ");
        uas = input.nextFloat();



        b_kehadiran = kehadiran/realisasi * 10;
        b_tugas = tugas * 20/100;
        b_uts = uts * 30/100;
        b_uas = uas * 40/100;
        total = b_kehadiran + b_tugas + b_uts + b_uas;
        
        
        System.out.println("\nJumlah Kehadiran: " + kehadiran);
        System.out.println("Bobot Kehadiran: " + b_kehadiran);
        System.out.println("Nilai Tugas: " + tugas);
        System.out.println("Nilai UTS: " + uts);
        System.out.println("Nilai UAS: " + uas);
        System.out.println("Total: " + total);

        input.close();
    }
}
