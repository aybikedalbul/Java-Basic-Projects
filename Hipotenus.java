

import java.util.Scanner;


public class Hipotenus {
	
	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
System.out.print("Hipotenüs hesaplamak için kenar uzunluğu giriniz: ");
int kenar_uzunlugu = scanner.nextInt();

System.out.print("2.kenar uzunluğu giriniz: ");
 
int kenar_uzunlugu2 = scanner.nextInt();
    
double hipo=Math.sqrt(kenar_uzunlugu*kenar_uzunlugu + kenar_uzunlugu2*kenar_uzunlugu2);

System.out.println("Hipotenüs uzunluğu: " + hipo);
    }
	
}
