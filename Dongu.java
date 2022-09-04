import java.util.Scanner;

public class Dongu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int toplam = 0, sayac = 0, cift_toplam = 0;

        System.out.print("Bir sayı giriniz: ");
        int input = scanner.nextInt();

        for (int i=1; i<=input; i++){
            if (i % 12 == 0) {
                toplam += i;
                sayac++;
            }
            if (i % 2 == 0) {
                cift_toplam++;
            }
        }
        System.out.println("Girdiğiniz sayıyya kadar olan, 3 ve 4 rakamlarına tam bölünen sayıların ortalaması: " + (toplam/sayac));
        System.out.println("Girdiğiniz sayıya kadar " + cift_toplam + " tane çift sayı vardır");
    }
}
