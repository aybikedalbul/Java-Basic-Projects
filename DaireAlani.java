import java.util.Scanner;

public class DaireAlani {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        int yaricap = scanner.nextInt();

        double alan = yaricap*yaricap*3.14;

        double cevre = 2*3.14*yaricap;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
    }
}
