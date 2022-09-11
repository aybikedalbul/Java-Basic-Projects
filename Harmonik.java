import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        double toplam = 0;
        for (double i = 1.0; i <= sayi; i++) {
            toplam += 1.0 / i;
        }
        System.out.println("Sonuç: " + toplam);
    }
}
