import java.util.Scanner;

public class Soal1UklMudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Volume Paket =====");
        System.out.print("panjang (cm): ");
        double panjang = input.nextDouble();
        System.out.print("lebar (cm): ");
        double lebar = input.nextDouble();
        System.out.print("tinggi (cm): ");
        double tinggi = input.nextDouble();

        System.out.println("masukkan berat paket (kg): ");
        int berat = input.nextInt();


        System.out.println("masukkan jarak pengiriman (km): ");
        int jarak = input.nextInt();

        double volume = (panjang * lebar * tinggi);

        int biayaPerKg = 0;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else if (berat <= 10) {
            biayaPerKg = 6000;
        } 

        int totalBiaya = berat * biayaPerKg;

        if (volume > 100000) {
            totalBiaya += 50000;
        }

        System.out.println("===== RINCIAN BIAYA =====");
        System.out.println("Volume paket: " + volume + " cm");
        System.out.println("Biaya volume paket: " + (volume > 1000000 ? "Rp 50000 (biaya tambahan)" : "Rp 0"));
        System.out.println("Jarak pengiriman: " + jarak + " km");
        System.out.println("Total biaya per kg: Rp " + totalBiaya);

        System.out.println("=========================================");
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);
        System.out.println(" Terimakasih telah menggunakan jasa kami ");
        
        
    }
}
