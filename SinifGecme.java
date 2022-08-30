import java.util.Scanner;

public class SinifGecme {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double ort=0;
        System.out.print("Matematik Notunuzu Giriniz:");
        int mat = scanner.nextInt();

        System.out.print("Fizik Notunuzu Giriniz:");
        int fizik = scanner.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz:");
        int turkce = scanner.nextInt();

        System.out.print("Kimya Notunuzu Giriniz:");
        int kimya = scanner.nextInt();

        System.out.print("Biyoloji Notunuzu Giriniz:");
        int biyoloji = scanner.nextInt();

        if (mat>0 || mat<100){
            ort += mat;
        }
        if (fizik>0 || mat<100){
            ort += fizik;
        }
        if (turkce>0 || mat<100){
            ort += turkce;
        }
        if (kimya>0 || mat<100){
            ort += kimya;
        }
        if (biyoloji>0 || mat<100){
            ort += biyoloji;
        }

        System.out.println("Sınıf ortalamanız: " + (ort/5));
        if (ort>55){
            System.out.println("Sınıfı Geçtiniz, Tebrikler!");
        }
        else {
            System.out.println("Sınıfı Geçemediniz!");
        }
    }
}
