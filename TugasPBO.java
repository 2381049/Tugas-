import java.util.Scanner;
public class TugasPBO {

    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static double hitungKelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungKelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static double hitungKelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sisi = scanner.nextDouble();
                double luasPersegi = hitungLuasPersegi(sisi);
                double kelilingPersegi = hitungKelilingPersegi(sisi);
                System.out.println("Luas persegi: " + luasPersegi);
                System.out.println("Keliling persegi: " + kelilingPersegi);
                break;

            case 2:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = scanner.nextDouble();
                double luasPersegiPanjang = hitungLuasPersegiPanjang(panjang, lebar);
                double kelilingPersegiPanjang = hitungKelilingPersegiPanjang(panjang, lebar);
                System.out.println("Luas persegi panjang: " + luasPersegiPanjang);
                System.out.println("Keliling persegi panjang: " + kelilingPersegiPanjang);
                break;

            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = scanner.nextDouble();
                double luasLingkaran = hitungLuasLingkaran(jariJari);
                double kelilingLingkaran = hitungKelilingLingkaran(jariJari);
                System.out.println("Luas lingkaran: " + luasLingkaran);
                System.out.println("Keliling lingkaran: " + kelilingLingkaran);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
