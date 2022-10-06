import java.util.Scanner;
import java.util.regex.Pattern;

public class DesenRecursive {

/*
    İstenilen: 16 11 6 1 -4 1 6 11 16 ve Recursive metot olacak
    16 --> 11 --> 6 --> 1 --> -4
    25 20 15 10 5 0
*/

    public static int Pattern(int sayi,int sayi2,int x){

        if (sayi > 0 && x != 1) {
            System.out.print(sayi + " ");
            return Pattern(sayi-5,sayi2,x);
        }

        else if (sayi <= 0 && x != 1){
            x = 1;
            System.out.print(sayi + " ");
            return Pattern(sayi+5,sayi2,x);
        }

        else if (sayi > 0 && x == 1 && sayi < sayi2){
                System.out.print(sayi + " ");
            return Pattern(sayi+5,sayi2,x);
        } else {
            return sayi2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println(Pattern(sayi,sayi,0) + " ");
    }
}


