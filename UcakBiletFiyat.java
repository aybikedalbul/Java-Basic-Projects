import java.util.Scanner;

public class UcakBiletFiyat {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("Uçak Bileti Hesap Programına Hoş Geldiniz!");
        System.out.println("===========================================");

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz, (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int type = scanner.nextInt();

        double fiyat = mesafe*0.10;
        if (mesafe > 0){

            if (type == 1){
                if (yas < 12) {
                    fiyat -= fiyat*0.5;
                    System.out.println("Bilet Fiyatı: " + fiyat + " TL");
                } else if (yas >= 12 && yas < 24) {
                    fiyat -= fiyat*0.1;
                    System.out.println("Bilet Fiyatı: " + fiyat + " TL");
                }
                if (yas >= 65) {
                    fiyat -= fiyat*0.3;
                    System.out.println("Bilet Fiyatı: " + fiyat + " TL");
                }
                else System.out.println("Bilet Fiyatı: " + fiyat + " TL");
            } else if (type == 2) {
                fiyat += fiyat;
                if (yas < 12) {
                    fiyat -= fiyat*0.5;
                    fiyat -= fiyat*0.2;
                    System.out.println("Bilet Fiyatı: " + fiyat + " TL");
                } else if (yas >= 12 && yas < 24) {
                    fiyat -= fiyat*0.1;
                    fiyat -= fiyat*0.2;
                    System.out.println("Bilet Fiyatı: " + fiyat + " TL");
                }
                if (yas >= 65) {
                    fiyat -= fiyat*0.3;
                    fiyat -= fiyat*0.2;
                    System.out.println("Bilet Fiyatı: " + fiyat + " TL");
                }
                else System.out.println("Bilet Fiyatı: " + fiyat + " TL");

            }
            else {
                System.out.println("Hatalı Veri Girdiniz!");
            }
        }
        else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
        }
}
