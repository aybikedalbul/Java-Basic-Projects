import java.util.Scanner;

public class Dongu2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Klavyeden bir sayı giriniz: ");
        int input = 0, toplam = 0;

        while (input % 2 == 0){

            System.out.print("Klavyeden bir sayı giriniz: ");
            input = scanner.nextInt();

            if (input % 2 != 0) {
                System.out.println("Tek sayı girdiğiniz için döngüden çıkıyorsunuz.");
            }

            if (input % 4 == 0) {
                toplam += input;
            }

        }

        System.out.println("Girdiğiniz sayılardan 4ün katı olanların toplamı: " + toplam);
    }
}
