package Task5;

import java.util.Scanner;

public class suyunHalleriMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suSicakligi;
        System.out.println("su sıcaklığı girin");
        suSicakligi = scan.nextInt();

        if (suSicakligi <0) {
            System.out.println("Su katı haldedir");
        } else if (suSicakligi > 0 && suSicakligi <=100) {
            System.out.println("Su sıvı haldedir");
        } else
            System.out.println("Gaz haldedir");

        scan.close();
    }
}
