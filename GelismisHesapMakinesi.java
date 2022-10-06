import java.util.Scanner;

public class GelismisHesapMakinesi {

    static void toplama(){
        int sonuc = 0, i = 0;



        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print((i+1) + ". sayı: ");
            int sayi = scanner.nextInt();

            if (sayi == 0) {
                break;
            }
            sonuc += sayi;
        }
        System.out.println("Toplama işleminin sonucu : " + sonuc);
    }

    static void cikarma(){
        Scanner scanner = new Scanner(System.in);
        int sonuc = 0, i = 0;

        while (true) {
            System.out.print((i+1) + ". sayı: ");
            int sayi = scanner.nextInt();

            if (sayi == 0) {
                break;
            }

            sonuc -= sayi;
        }

        System.out.println("Çıkarma işleminin sonucu: " + sonuc);
    }

    static void carpma(){
        Scanner scanner = new Scanner(System.in);

        int sonuc = 1, i = 0;
        while (true) {
            System.out.print((i+1) + ". sayı: ");
            int sayi = scanner.nextInt();

            if (sayi == 0) {
                break;
            }
            sonuc *= sayi;
        }
        System.out.println("Çarpma işleminin sonucu : " + sonuc);
        }

        static void bolme(){
        Scanner scanner = new Scanner(System.in);
            System.out.print("İlk sayıyı giriniz: ");
            int sayi1 = scanner.nextInt();

            System.out.print("İkinci sayıyı giriniz: ");
            int sayi2 = scanner.nextInt();

            if (sayi1 > sayi2 && sayi2 != 0) {
                System.out.println("Bölme işleminin sonucu: " + (sayi1/sayi2));
            }if (sayi2 > sayi1 && sayi1 != 0) {
                System.out.println("Bölme işleminin sonucu: " + (sayi2/sayi1));
            }
            }

            static void usluSayi(){
        Scanner scanner = new Scanner(System.in);
        int sonuc = 1;
                System.out.print("Bir üs giriniz: ");
                int us = scanner.nextInt();

                System.out.print("Bir taban giriniz: ");
                int taban = scanner.nextInt();

                for (int i = 0; i < us; i++){
                    sonuc *= taban;
                }
                System.out.println("Üslü ifadenin sonucu: " + sonuc);
    }

    static void fibonacchiHesap() {
        Scanner scanner = new Scanner(System.in);
        int a = 1, b = 1, c;

        System.out.print("Fibonacchi dizisi kaç ilerlesin? ");
        int n = scanner.nextInt();

        System.out.print(a + " " + b + " ");
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
    static void mod(){
        Scanner scanner = new Scanner(System.in);
        int sonuc = 0;
        System.out.print("Modu alınacak sayı: ");
        int n = scanner.nextInt();

        System.out.print("Mod:  ");
        int n2 = scanner.nextInt();

        sonuc = n % n2;

        System.out.println("Mod alma işlemi sonucu: " + sonuc);
    }

    static  void DikdortgenHesap(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dikdörtgenin kısa kenarı: ");
        int kisa = scanner.nextInt();
        System.out.print("Dikdörtgenin uzun kenarı: ");
        int uzun = scanner.nextInt();

        System.out.println("Dikdörtgenin alanı: "  + (kisa*uzun));
        System.out.println("Dikdörtgenin çevresi: "  + (kisa*2 + 2*uzun));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "--İŞLEMLER--\n" +
                "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n" +
                "4-Bölme İşlemi\n" +
                "5-Üslü Sayı Alma İşlemi\n" +
                "6-Fibonacci Dizisi\n" +
                "7-Mod Alma İşlemi\n" +
                "8-Dikdörtgen Hesaplama İşlemi";

        System.out.println(islemler);
        System.out.print("Bir işlem seçiniz: ");
        int islem = scanner.nextInt();

        switch (islem){
            case 1: toplama();
            break;

            case 2: cikarma();
            break;

            case 3: carpma();
            break;

            case 4: bolme();
            break;

            case 5: usluSayi();
            break;

            case 6: fibonacchiHesap();
            break;

            case 7: mod();
            break;

            case 8: DikdortgenHesap();
            break;

            default:
                System.out.println("Yanlış bir sayı girdiniz!");
        }
    }

}