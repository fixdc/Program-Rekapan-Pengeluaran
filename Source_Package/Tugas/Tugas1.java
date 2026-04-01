package Source_Package.Tugas;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //ini variabel buat sementara
        float makan, transport, belanja;
        float p_makan, p_transport, p_belanja;

        //ini variabel kumulasi
        float total_makan = 0 , total_transport = 0 , total_belanja = 0;

        System.out.println("==========================");
        System.out.println("Rekapan pengeluaran 7 hari");
        System.out.println("==========================");
        System.out.println();

        System.out.println("==========================");
        System.out.println("Pengeluaran Hari ke-1");
        System.out.println("==========================");
        System.out.println("Masukan Total Makan(Max Rp.20000):");
        makan = input.nextFloat();
        System.out.println("Masukan Total Transport(Max Rp.10000):");
        transport = input.nextFloat();
        System.out.println("Masukan Total Belanja(Max Rp.50000):");
        belanja = input.nextFloat();

        total_makan += makan;
        total_transport += transport;
        total_belanja += belanja;

        p_makan = (makan/80000) *100;
        p_transport = (transport/80000) *100;
        p_belanja = (belanja/80000) *100;

        System.out.println("==========================");
        System.out.println("Pengeluaran Hari ke-1");
        System.out.println("==========================");
        System.out.println("Makan = Rp." + makan + "/ Rp.20,000 (" + p_makan +  "/25%)");
        System.out.println("Transport = Rp." + transport + "/ Rp.10,000 (" + p_transport +  "/12,5%)");
        System.out.println("Belanja = Rp." + belanja + "/ Rp.50,000 (" + p_belanja +  "/62,5%)");
        System.out.println("==========================");
        System.out.println("Rp." + (makan+transport+belanja) + "/Rp.80,000" + " atau " + (p_makan+p_transport+p_belanja) + "/100%");
        System.out.println("Hemat : Rp." + (80000 - (makan+transport+belanja)) );

    }
}
