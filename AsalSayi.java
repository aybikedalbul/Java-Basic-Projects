import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args){

        //1-100 arası asal sayıları ekrana yazdıran java programı, kendisinden başka bir sayıya bölünmeyen sayıya asal sayı denir

        boolean asalmi = true;
        for (int i = 2; i < 100; i++){

            for (int j = 2; j < i; j++){

                if (i % j == 0) {

                    asalmi = false;
                    break;
                }
                else {
                    asalmi = true;
                }
            }

            if (asalmi == true){
                System.out.print(i + " - ");
            }

        }
    }
}
