package Task4;

import java.util.Scanner;

public class elektrikMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Eski okuma değeri girin");
        int eskiOkuma = scan.nextInt();

        System.out.println("Yeni okuma değeri girin");
        int yeniOkuma = scan.nextInt();

        faturaHesaplama fatura = new faturaHesaplama(yeniOkuma,eskiOkuma);
        System.out.println("Elektrik tüketimi" + " " +fatura.getElektrikTüketimi() + "kWh");
        System.out.println("Birim fiyatı" + " " + fatura.getBirimFiyati());
        System.out.println("Aylık fatura" + " " + fatura.getAylikFatura() + "TL");

        scan.close();
    }
}
