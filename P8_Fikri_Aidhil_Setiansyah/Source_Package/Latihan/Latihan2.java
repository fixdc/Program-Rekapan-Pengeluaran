import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.println("Nama : ");
            String nama = input.nextLine();

            System.out.println("Nim : ");
            String nim = input.nextLine();

            System.out.println("Data " + nama + " - " + nim);

            System.out.println("Ulangi (y/t)");
            ulang = input.next().charAt(0);
            input.nextLine();

        } while (ulang == 'y' || ulang == 'Y');

        input.close();
    }
}
