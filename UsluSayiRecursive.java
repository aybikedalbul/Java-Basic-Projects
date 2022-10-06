import java.util.Scanner;

public class UsluSayiRecursive {
    public static int UsluSayi(int taban, int us){

        if (us == 0){
            return 1;
        }
        return taban * UsluSayi(taban,--us);


    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir taban giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Bir üs giriniz: ");
        int us = scanner.nextInt();

        System.out.println("Üslü işlemin sonucu: " + UsluSayi(taban,us));

    }
}
