import java.util.Scanner;

public class ATM {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("ATM SİSTEMİNE HOŞ GELDİNİZ!");
        System.out.println("****************************");
        int bakiye = 2000, parola=12345;
        String kullanici_adi = "deneme";
        String islemler = "İşlemler:\n1-Para Çekme\n2-Para Yatırma\n3-Bakiye Sorgulama\n4-Çıkış Yapma";

        System.out.print("Kullanıcı adınızı giriniz: ");
        String kul_adi = scanner.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        int sifre = scanner.nextInt();

        if (kul_adi.equals(kullanici_adi) && sifre == parola) {

            System.out.println("Giriş Başarılı!");
            System.out.println("****************************");

            System.out.println(islemler);

            System.out.print("Bir işlem seçiniz: ");
            int secim = scanner.nextInt();

            switch (secim) {

                case 1:
                    System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                    int tutar = scanner.nextInt();

                    if (tutar > bakiye) {
                        System.out.println("Mevcut bakiyenizden daha fazla para çekemezsiniz!");
                        System.out.println("Bakiye: " + bakiye);
                    } else {
                        bakiye -= tutar;
                        System.out.println("Kalan bakiyeniz: " + bakiye);
                    }
                    break;

                case 2:
                    System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                    int tutar2 = scanner.nextInt();
                    bakiye += tutar2;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                    break;

                case 3:
                    System.out.println("Mevcut Bakiyeniz: " + bakiye);
                    break;

                case 4:
                    System.out.println("Çıkış Yaptınız!");
            }
        }
        else {
            System.out.println("Girişiniz hatalı lütfen tekrar deneyiniz!");
        }

    }
}
