import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
 ********* yildiz = 9 bosluk = 0 n=5  yildiz=2n-(2i+1)
  *******  yildiz = 7 bosluk = 1
   *****   yildiz = 5 bosluk = 2
    ***    yildiz = 3 bosluk = 3
     *     yildiz = 2 bosluk = 4
 */

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        for (int i=0; i<sayi; i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int t=((2*sayi)-(2*i+1)); t>0; t--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
