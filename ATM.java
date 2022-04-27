import java.util.Scanner;
public class Atm {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	    String islemler= "1.işlem:Bakiye Öğrenme\n"
	    		        +"2.işlem:Para Çekme\n"
	    		        +"3.işlem:Para Yatırma\n"
	    		        +"Çıkış için q'ya basın.";
	    System.out.println("**********************");
	    System.out.println(islemler);
	    System.out.println("**********************");
	     int bakiye=1000;
	    while (true){
	    	System.out.println("İşlem seçiniz: ");
	    	String islem=scan.nextLine();
	       if(islem.equals("q"))
	       {
	    	   System.out.println("Sistemden çıkış yapılıyor...");
	    	   break;
	       }
	       else if (islem.equals("1")) {
	    	   System.out.println("Bakiyeniz: " +bakiye);
	    	   
	    	  
	       }
	       else if(islem.equals("2")) {
	    	   System.out.println("Para çekmek için tutar giriniz: ");
	    	   int tutar = scan.nextInt();
	    	   scan.nextLine();
	    	   if (tutar>1000) {
	    		   System.out.println("Bakiye yetersiz.Bakiyeniz:"+bakiye);
	    	   } 
	    	   else {
	    		   bakiye-=tutar;
	    		   System.out.println("Yeni bakiyeniz: "+bakiye); }
	       }
	    	   
	    	else if (islem.equals("3")) {
	    	  System.out.println("Yatırmak istediğiniz tutarı giriniz:");
	    	  int tutar=scan.nextInt();
	    	  scan.nextLine();
	    	  bakiye += tutar;
	    	  System.out.println("Yeni bakiyeniz: "+bakiye);
	      
	       
	    	}

	    }
		
	}
}
