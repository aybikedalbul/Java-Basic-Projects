import java.util.Scanner;

public class ManavHesap {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlıcan=5.00;

        System.out.print("Kaç kilo armut aldınız? : ");
        int armut_kilo = scanner.nextInt();

        System.out.print("Kaç kilo elma aldınız? : ");
        int elma_kilo = scanner.nextInt();

        System.out.print("Kaç kilo domates aldınız? : ");
        int domates_kilo = scanner.nextInt();

        System.out.print("Kaç kilo muz aldınız? : ");
        int muz_kilo = scanner.nextInt();

        System.out.print("Kaç kilo patlıcan aldınız? : ");
        int patlıcan_kilo = scanner.nextInt();

        double toplam = armut_kilo*armut +elma*elma_kilo + domates_kilo*domates + muz_kilo*muz + patlıcan_kilo*patlıcan;

        System.out.println("Toplam tutar: " + toplam);

    }
}
