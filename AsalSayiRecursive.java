import java.util.Scanner;

public class AsalSayiRecursive {

    public static void AsalSayi(int i,int sayi){

        if (sayi == 2) {
            System.out.println("Sayı asaldır.");
            return;
        }if (sayi == i) {
            System.out.println("Sayı asaldır.");
            return;
        }
            if (sayi % i == 0) {
                System.out.println("Sayı asal değildir.");
                return;
            }

            AsalSayi(++i,sayi);
    }
    //7
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        AsalSayi(2,sayi);
    }
}
