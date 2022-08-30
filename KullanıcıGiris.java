import java.util.Scanner;

public class KullanıcıGiris {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        String kullanici_adi = scanner.nextLine();

        System.out.print("Parolanızı giriniz: ");
        String pass = scanner.nextLine();

        if (kullanici_adi.equals("aybikedalbul") && pass.equals("deneme")){
            System.out.println("Başarıyla Giriş Yaptınız!");
        }
        else{
            System.out.print("Hatalı giriş yaptınız! Şifreyi güncellemek istiyorsanız \"yes\" istemezsiniz \"no\" yazınız: ");
            String secim = scanner.nextLine();

            if(secim.equals("no")){
                System.out.println("Programdan Çıktınız.");
            }
            else{
                System.out.print("Yeni Şifrenizi Yazınız: ");
                String new_pass = scanner.nextLine();
                System.out.println("Şifreniz başarıyla güncellendi!");

            }

        }
    }
}
