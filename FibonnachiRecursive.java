import java.util.Scanner;

public class FibonnachiRecursive {

    public static int fibonacchi(int n){

        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacchi(n-1) + fibonacchi(n-2);


    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int sonuc = fibonacchi(sayi);

        System.out.println("Girdiğiniz sayıya kadar olan fibonachi dizisinin toplam sonucu: " + sonuc);

    }
}
