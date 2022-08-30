import java.util.Scanner;

public class KdvTutari {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salt tutarı giriniz:");
        double tutar = scanner.nextDouble();

        if (tutar>0 && tutar<=1000){
            double kdv = (tutar*0.18);
            System.out.println("KDV değeri: " + kdv);
            System.out.println("KDVli tutar: " + (tutar+kdv));
        }

        else {
            double kdv = (tutar*0.08);
            System.out.println("KDV değeri: " + kdv);
            System.out.println("KDVli tutar: " +(tutar+kdv));
        }
    }
}