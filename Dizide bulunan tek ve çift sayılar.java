
import java.util.Scanner;

public class Sayilar {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        int[] dizi = new int[5];
        
       
        System.out.print("5 sayı giriniz: ");
        
        for(int i=0; i<5; i++) {
            
             dizi[i] =scan.nextInt();
            
        }
        System.out.print("Çift sayılar: ");
         for(int j=0; j<5; j++) {
             
             if(dizi[j]%2==0) {
                 
                 System.out.print(" " + dizi[j]);
             }
             
         }    
         System.out.println(" ");
         System.out.print("Tek sayılar: ");
                for(int h=0; h<5; h++) {
                    
                    if(dizi[h]%2==1) {
                        
                        System.out.print(" " + dizi[h]);
                    }
                }

     }
}
