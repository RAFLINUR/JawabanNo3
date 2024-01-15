import java.util.ArrayList;
import java.util.Scanner;

public class ParkiranApartemen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lantai1 = new ArrayList<>();
        ArrayList<String> lantai2 = new ArrayList<>();
        ArrayList<String> lantai3 = new ArrayList<>();

        while (true) {
            System.out.println("Masukkan kapasitas mesin kendaraan (cc): ");
            int kapasitasMesin = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            String kendaraan = "Kendaraan " + (lantai1.size() + lantai2.size() + lantai3.size() + 1);

            if (kapasitasMesin >= 2500) {
                System.out.println(kendaraan + " masuk ke lantai 1");
                lantai1.add(kendaraan);
            } else if (kapasitasMesin >= 1500 && kapasitasMesin < 2500) {
                System.out.println(kendaraan + " masuk ke lantai 2");
                lantai2.add(kendaraan);
            } else if (kapasitasMesin >= 1000 && kapasitasMesin < 1500) {
                System.out.println(kendaraan + " masuk ke lantai 3");
                lantai3.add(kendaraan);
            } else {
                System.out.println("Kendaraan dengan kapasitas mesin " + kapasitasMesin + " cc tidak dapat masuk");
            }

            System.out.println("Data kendaraan di lantai 1: " + lantai1);
            System.out.println("Data kendaraan di lantai 2: " + lantai2);
            System.out.println("Data kendaraan di lantai 3: " + lantai3);

            System.out.println("Apakah ada kendaraan lain yang akan masuk? (Ya/Tidak): ");
            String pilihan = scanner.nextLine();

            if (pilihan.equalsIgnoreCase("Tidak")) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            }
        }
        scanner.close();
    }
}
