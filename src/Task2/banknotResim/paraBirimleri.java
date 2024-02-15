package Task2.banknotResim;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class paraBirimleri {
    static class ParaBirimleri {
        private String ulke;
        private String paraBirimi;
        private Map<Integer, String> degerler;

        // Constructor
        public ParaBirimleri(String ulke) {
            this.ulke = ulke;
            this.degerler = new TreeMap<>();
            switch (ulke) {
                case "Türkiye":
                    this.paraBirimi = "TRY";
                    this.degerler.put(5, "Atatürk ve Ordinaryus Profesör Doktor Aydın Sayılı");
                    this.degerler.put(10, "Atatürk ve Profesör Doktor Cahit Arf");
                    this.degerler.put(20, "Atatürk ve Mimar Ahmed Kemaleddin");
                    this.degerler.put(50, "Atatürk ve Fatma Aliye Hanım");
                    this.degerler.put(100, "Atatürk ve Buhurizade Mustafa Itrî");
                    break;
                case "Avrupa":
                    this.paraBirimi = "Euro";
                    this.degerler.put(5, "Ponte Vecchio Köprüsü, Floransa, İtalya");
                    this.degerler.put(10, "Rheinbrücke Kemerli Köprü, Heidelberg, Almanya");
                    this.degerler.put(20, "Pont du Gard Su Kemeri, Nîmes, Fransa");
                    this.degerler.put(50, "Artemis Tapınağı, Efes, Türkiye");
                    this.degerler.put(100, "Sistine Madonna, Michelangelo'nun eseri, Floransa, İtalya");
                    this.degerler.put(200, "Gizemli Çiçekler Buketi, Jan van Huysum'un Eseri, Amsterdam, Hollanda");
                    this.degerler.put(500, "Altın Kapı, Köln Katedrali, Köln, Almanya");
                    break;
                case "Amerika":
                    this.paraBirimi = "Amerikan Doları";
                    this.degerler.put(1, "George Washington");
                    this.degerler.put(2, "Thomas Jefferson");
                    this.degerler.put(5, "Abraham Lincoln");
                    this.degerler.put(10, "Alexander Hamilton");
                    this.degerler.put(20, "Andrew Jackson");
                    this.degerler.put(50, "Ulysses S. Grant");
                    this.degerler.put(100, "Benjamin Franklin");
                    break;
                default:
                    System.out.println("Geçersiz ülke.");
                    break;
            }
        }

        public String getParaBirimi() {
            return paraBirimi;
        }

        public void listeParaBirimleri() {
            System.out.println("Geçerli para birimleri ve değerleri:");
            for (Integer deger : degerler.keySet()) {
                System.out.println(deger + " " + paraBirimi);
            }
        }

        public String getKisiVeyaEser(int girilenDeger) {
            return degerler.get(girilenDeger);
        }
    }
}
