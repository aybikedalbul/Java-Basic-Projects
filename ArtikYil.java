import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("Artık Yıl Hesaplama Programına Hoş Geldiniz!");
        System.out.println("===========================================");

        System.out.print("Bir yıl giriniz: ");
        int yil = scanner.nextInt();

        if (yil % 4 == 0) {
            System.out.println(yil + " Bir artık yıldır!");
        }
        else if(yil % 100 == 0 && yil % 400 == 0){
            System.out.println(yil + " Bir artık yıldır!");
        }
        else System.out.println(yil + " Bir artık değildir!");
    }
}
