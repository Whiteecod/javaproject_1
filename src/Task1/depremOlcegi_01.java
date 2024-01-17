package Task1;

import java.util.Scanner;

public class depremOlcegi_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Deprem büyüklüğünü girin: ");

        // Kullanıcıdan girişi String olarak al
        String input = scanner.nextLine();

        // Girişi double'a çevirerek kontrol et
        try {
            double buyukluk = Double.parseDouble(input);

            // Tanımlayıcıyı belirle ve ekrana yazdır
            String tanimlayici = belirleTanımlayıcı(buyukluk);
            System.out.println("Deprem: " + tanimlayici);
        } catch (NumberFormatException e) {
            System.out.println("Geçersiz giriş. Lütfen bir sayı girin.");
        }
        scanner.close();
    }


    public static String belirleTanımlayıcı(double buyukluk) {
        if (buyukluk < 2.0) {
            return "Micro - Mikro";
        } else if (buyukluk >= 2.0 && buyukluk < 3.0) {
            return "Very minor - Çok küçük";
        } else if (buyukluk >= 3.0 && buyukluk < 4.0) {
            return "Minor - Küçük";
        } else if (buyukluk >= 4.0 && buyukluk < 5.0) {
            return "Light - Hafif";
        } else if (buyukluk >= 5.0 && buyukluk < 6.0) {
            return "Moderate - Orta";
        } else if (buyukluk >= 6.0 && buyukluk < 7.0) {
            return "Strong - Ağır";
        } else if (buyukluk >= 7.0 && buyukluk < 8.0) {
            return "Major - Büyük";
        } else if (buyukluk >= 8.0 && buyukluk < 10.0) {
            return "Great - Çok Büyük";
        } else {
            return "Meteoric - Meteorik";
        }
    }
}