import java.util.Scanner;

public class UsluSayi {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int sonuc = 1;
        System.out.print("Bir üs giriniz: ");
        int us = scanner.nextInt();

        System.out.print("Bir taban giriniz: ");
        int taban = scanner.nextInt();

        for (int i=0; i<us; i++){
            sonuc *= taban;
        }
        System.out.println(" Sonuç : "+ sonuc);
    }
}
