import java.util.Scanner;

//EKOK = (n1*n2) / EBOB

public class EbobEkok {
    public static void main(String[] args) {

        int sayi  = 0, ekok = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first_number = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second_number = scanner.nextInt();

        if (first_number > second_number){
            sayi = second_number;

            while (sayi > 0){
                if (first_number % sayi == 0 && second_number % sayi == 0){
                    System.out.println("Ebob: " +  sayi);
                    ekok = (first_number*second_number)/sayi;
                    break;
                }
                sayi--;
            }
        }
        else if (first_number < second_number){
            sayi = first_number;

            while (sayi > 0){
                if (first_number % sayi == 0 && second_number % sayi == 0){
                    System.out.println("Ebob: " +  sayi);
                    ekok = (first_number*second_number)/sayi;
                    break;
                }
                sayi--;
            }
        }
        System.out.println("Ekok: " + ekok);

    }
}
