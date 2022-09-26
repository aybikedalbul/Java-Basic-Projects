import java.util.Scanner;

public class SayiBulma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int enb=0, enk=0;

        System.out.print("Kaç tane sayı gireceksiniz? : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi = scanner.nextInt();

            if (i == 1){
                enb = sayi;
                enk = sayi;
            }

            if (sayi > enb){
                enb = sayi;
            }
            if (sayi < enk){
                enk = sayi;
            }
        }

        System.out.println("En büyük sayı: " + enb);
        System.out.println("En küçük sayı: " + enk);
    }
}
