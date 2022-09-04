import java.util.Scanner;

public class Dongu3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println("Girdiğiniz sayıya kadar olan 4 ve 5 in katları olan sayılar: ");
        for (int i = 1; i<=sayi; i++){
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
