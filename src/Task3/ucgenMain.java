package Task3;

import java.util.Scanner;

public class ucgenMain {
    public static void main(String[] args) {

        // kullanıcıdan ilk kenar uzunluğu okuma
        Scanner scan = new Scanner(System.in);

        System.out.println("Geçerli ilk kenar uzunluğu giriniz");
        double kenar1 = scan.nextDouble();

        System.out.println("Geçerli ikinci kenar uzunluğu giriniz");
        double kenar2 = scan.nextDouble();

        System.out.println("Geçerli üçüncü kenar uzunluğu giriniz");
        double kenar3 = scan.nextDouble();

        String sonuc = ucgenBelirle(kenar1, kenar2, kenar3);

        System.out.println(sonuc);


    }

    public static String ucgenBelirle(double kenar1, double kenar2, double kenar3) {
        String sonuc;
        if (kenar1 + kenar2 > kenar3 && kenar1 + kenar3 > kenar2 && kenar2 + kenar3 > kenar1)

            if (kenar1 == kenar2 && kenar2 == kenar3) {
                sonuc = "Bu bir eşkenar ucgendir";
            } else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
                sonuc = "Bu bir ikizkenar ücgendir";
            } else {
                sonuc = "Bu bir çeşitkenar Üçgendir";
            } else {
                sonuc = "Bu bir üçgen değildir";
        }
        return sonuc;
    }
}
