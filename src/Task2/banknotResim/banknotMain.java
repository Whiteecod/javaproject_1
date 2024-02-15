package Task2.banknotResim;

import java.util.Scanner;

public class banknotMain extends paraBirimleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir ülke seçiniz (Türkiye, Avrupa, Amerika):");
        String secilenUlke = scanner.nextLine();

        ParaBirimleri paraBirimleri = new ParaBirimleri(secilenUlke);

        paraBirimleri.listeParaBirimleri();

        System.out.println("Lütfen bir değer girin:");
        int girilenDeger = scanner.nextInt();

        String kisiVeyaEser = paraBirimleri.getKisiVeyaEser(girilenDeger);

        if (kisiVeyaEser != null) {
            System.out.println(girilenDeger + " " + paraBirimleri.getParaBirimi() + " için karşılık gelen kişi veya eser: " + kisiVeyaEser);
        } else {
            System.out.println("Bu değer için bir eşleşme bulunamadı.");
        }
    }
}
