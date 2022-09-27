import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){

            for (int a = 0; a < (n-i); a++){
                System.out.print(" ");
            }

            for (int j = 0; j <((2*i)+1); j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
/*
   * bosluk = 3 n=3 i=0 n-1
  *** bolsuk = 2
 ***** bosluk 1
********
 */