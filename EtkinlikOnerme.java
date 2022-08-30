import java.util.Scanner;

public class EtkinlikOnerme {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hava sıcaklığını yazınız: ");
        int hava = scanner.nextInt();

        if (hava < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if(hava >= 5 || hava < 15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if(hava >= 15 || hava < 25){
            System.out.println("Piknik yapabilirsiniz.");
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
