package P2_Fikri_Aidhil_Setiansyah.Source_Package.Latihan;

import java.util.Scanner;

public class Latihan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama ; 
        int usia ;
        System.out.print("input nama :");
        nama = input.nextLine();
        System.out.print("input usia :");
        usia = input.nextInt();
        System.out.println("Nama :" + nama + "Umur :" + usia);
        input.close();
    }
}
