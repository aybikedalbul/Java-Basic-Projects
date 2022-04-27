import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
    
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir Sayı Giriniz: ");
		int sayi=scan.nextInt();
		System.out.println("Girdiğiniz Sayının Kaç Basamaklı Olduğunu Yazınız: ");
		int basamak_sayisi=scan.nextInt();
		int toplam=0;
		int gecici_sayi=sayi;
		do {
			int basamak_degeri=gecici_sayi%10;
			gecici_sayi/=10;
			toplam+=Math.pow(basamak_degeri, basamak_sayisi);
			
		}
		while(gecici_sayi>0);
		
	if (sayi==toplam) {
		System.out.println("Girdiğiniz sayı bir Armstrong sayıdır.");
	}
	else {
		System.out.println("Girdiğiniz sayı bir Armstrong sayı değildir.");
	}
	}
}
