import java.util.Scanner;

public class EnBuyuk {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
        System.out.print("Klavyeden 1.sayıyı giriniz: ");
        int ilk_sayi = scanner.nextInt();
        int enb = ilk_sayi; //Girilen ilk sayıyı en büyük kabul ettik.

        for (int i=1; i<10; i++){
            System.out.print("Klavyeden " + (i+1) + ". sayıyı giriniz: ");
            int sayi = scanner.nextInt();

            if (enb < sayi){
                enb = sayi;
            }
        }

        System.out.println("Girdiğiniz sayılardan en büyüğü: " + enb);
    }

    }
