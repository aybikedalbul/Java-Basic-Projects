import java.util.Scanner;

public class KutleIndeks {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        double uzunluk = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        double indeks = kilo / (uzunluk*uzunluk);

        System.out.println("Vücut Kütle İndeksiniz:  "  + indeks);
    }
}
