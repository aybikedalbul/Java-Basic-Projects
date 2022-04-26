import java.util.Scanner;
public class palindromic {

    public static void main(String[] args) {
        // Palindromik kelime örneği: nalan,kapak,mum,kapak
    
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir kelime giriniz: ");
            String kelime = scanner.nextLine();
            int sayac = 0;
            String yeni_kelime = "";
    
            for (int i=kelime.length()-1; i>=0; i--){
                yeni_kelime += kelime.charAt(i);
            }
            if (yeni_kelime.equals(kelime)){
                System.out.println("Girdiğiniz kelime palindrom kelimedir.");
            }
            else {
                System.out.println("Girdiğiniz kelime polindrom kelime değildir.");
            }
    
        }
    
}
