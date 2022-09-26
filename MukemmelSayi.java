import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        for (int i=(sayi-1); i>0; i--){

            if (sayi % i == 0){
                toplam += i;;
            }

        }
        if (toplam == sayi){
            System.out.println("Girdiğiniz sayı mükemmel sayıdır.");
        }

        else {
            System.out.println("Girdiğiniz sayı mükemmel sayı değildir!");
        }
    }
}
