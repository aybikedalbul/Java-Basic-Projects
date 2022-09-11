import java.util.Scanner;

public class Kombinasyon {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int faktoriyel=1,faktoriyel2=1, faktoriyel3=1;

        System.out.print("n degerini giriniz: ");
        int n = scan.nextInt();

        System.out.print("r degerini giriniz: ");
        int r = scan.nextInt();


            for(int i=n; i>0; i--){
                faktoriyel *= i;
            }
            for (int j=r; j>0; j--){
                faktoriyel2 *= j;
            }
            for (int t=(n-r); t>0; t--){
            faktoriyel2 *= t;
        }

        System.out.println("C(" + n +"," + r + ") :" + (faktoriyel/(faktoriyel2*faktoriyel3)));

        }
    }