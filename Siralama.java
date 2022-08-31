import java.util.Scanner;

public class Siralama {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı: ");
        int a = scanner.nextInt();

        System.out.print("2. sayıyı: ");
        int b = scanner.nextInt();

        System.out.print("3. sayıyı: ");
        int c = scanner.nextInt();

        //a=9 b=8 c=7
        if (a<b && a<c){
            if (b<c){
                System.out.println(a + " < " + b + " < " + c);
            }
            else {
                System.out.println(a + " < " + c + " < " + b);
            }
        }


        else if (b<a && b<c){
            if (a<c){
                System.out.println(b + " < " + a + " < " + c);
            }
            else {
                System.out.println(b + " < " + c + " < " + a);
            }
        }
        else if (c<a && c<b){
            if (b<a){
                System.out.println(c + " < " + b + " < " + a);
            }
            else {
                System.out.println(c + " < " + a + " < " + b);
            }
        }

    }
}
