import java.util.Scanner;

class Pembayaran {
    String metode;
    String mataUang;

    void proses() {
        System.out.println("memproses pembayaran ...");
    }

    void info() {
        System.out.println("Metode : " + metode + ", mata uang: " + mataUang);
    }

    void info(String nama) {
        System.out.println(nama + "memilih metode " + metode + " dengam mata uang" + mataUang);
    }

    void info(String nama, double jumlah) {
        System.out.println(nama + " akan membayar sebesar " + jumlah + " " + mataUang + " melalui" + metode);
    }
}

class TransferBank extends Pembayaran {
    @Override
    void proses() {
        System.out.println("Pembayaran via transfer bank sedang diproses...");
    }
}

class EWallet extends Pembayaran {
    @Override
    void proses() {
        System.out.println("Pembayaran via e-wallet sedang diproses...");
    }
}

class Tunai extends Pembayaran {
    @Override
    void proses() {
        System.out.println("Pembayaran tunai sedang diproses...");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Pilih Metode Pembayaran");
            System.out.println("2. Exit");
            System.out.print("Pilih menu (1/2): ");
            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.println("\nPilih metode pembayaran:");
                    System.out.println("1. Transfer Bank");
                    System.out.println("2. E-Wallet");
                    System.out.println("3. Tunai");
                    System.out.print("Pilihan (1/2/3): ");
                    String metode = input.nextLine();

                    Pembayaran bayar;
                    switch (metode) {
                        case "1":
                            bayar = new TransferBank();
                            bayar.metode = "Transfer Bank";
                            break;
                        case "2":
                            bayar = new EWallet();
                            bayar.metode = "E-Wallet";
                            break;
                        case "3":
                            bayar = new Tunai();
                            bayar.metode = "Tunai";
                            break;
                        default:
                            System.out.println("Metode tidak valid.");
                            continue;
                    }

                    System.out.print("Pilih mata uang (Rupiah/Dollar): ");
                    bayar.mataUang = input.nextLine();

                    System.out.print("Nama pelanggan: ");
                    String nama = input.nextLine();

                    System.out.print("Jumlah pembayaran: ");
                    double jumlah = Double.parseDouble(input.nextLine());

                    bayar.proses(); // OVERRIDING
                    bayar.info(); // METHOD ASLI
                    bayar.info(nama); // OVERLOADING 1
                    bayar.info(nama, jumlah); // OVERLOADING 2
                    break;

                case "2":
                    System.out.println("Keluar dari program...");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        input.close();
    }
}
