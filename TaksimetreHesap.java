import java.util.Scanner;

public class TaksimetreHesap {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double tutar;
        int acilis_ucreti = 10;

        System.out.println("Taksimetre Sistemine Hoşgeldiniz!");

        System.out.print("Lütfen kaç km yol gittiğinizi yazınız: ");
        int km = scanner.nextInt();

        tutar = ((km * 2.20) + acilis_ucreti);

        tutar = (tutar < 20) ? 20 : tutar;

        System.out.println("Toplam Tutar: " + tutar + " TL");


    }
}
