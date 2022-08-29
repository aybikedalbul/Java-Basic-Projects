import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************************************************");
        System.out.println("Not Ortalaması Hesaplama Sistemine Hoşgeldiniz!!");
        System.out.println("*****************************************************");

        System.out.print("Matematik dersi vize notunuzu giriniz: ");
        double mat_vize = scanner.nextDouble();
        System.out.print("Matematik dersi final notunuzu giriniz: ");
        double mat_final = scanner.nextDouble();
        double mat_ort = ((mat_vize*0.4) + (mat_final*0.6));

        System.out.println("------------------------------------------");

        System.out.print("Fizik dersi vize notunuzu giriniz: ");
        double fizik_vize = scanner.nextDouble();
        System.out.print("Fizik dersi final notunuzu giriniz: ");
        double fizik_final = scanner.nextDouble();
        double fizik_ort = ((mat_vize*0.4) + (mat_final*0.6));


        System.out.println("------------------------------------------");

        System.out.print("Türkçe dersi vize notunuzu giriniz: ");
        double turkce_vize = scanner.nextDouble();
        System.out.print("Türkçe dersi final notunuzu giriniz: ");
        double turkce_final = scanner.nextDouble();
        double turkce_ort = ((mat_vize*0.4) + (mat_final*0.6));

        double ort = (mat_ort+fizik_ort+turkce_ort) / 3 ;

        System.out.println("------------------------------------------");
        System.out.println("Ortalamanız: " + (ort));
        String sonuc = (ort >= 60) ? "Geçtiniz!": "Kaldınız!:";
        System.out.println(sonuc);






    }
}
