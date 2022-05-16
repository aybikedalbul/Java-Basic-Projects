package com.company;

import java.util.Scanner;
class SiyasiException extends Exception{

    public void printStackTrace(){
        System.out.println("Siyasi Yasağınız Bulunuyor!");
    }
}
class VizeException extends Exception{
    public void printStackTrace(){
        System.out.println("Gideceğiniz Ülkeye Vizeniz Bulunmamaktadır!");
    }
}

class HarcException extends Exception{
    public void printStackTrace(){
        System.out.println("Lütfen Yurtdışı Harcını Tam Yatırınınz!");
    }
}
public class Yolcu {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yatırdığınız Harç Bedeli: ");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Herhangi bir siyasi yasağınız bulunuyor mu?(Evet veya hayır) ");
        String cevap = scanner.nextLine();

        if (cevap.equals("evet")){
            this.siyasiYasak = true;
        }
        else{
            this.siyasiYasak = false;
        }

        System.out.print("Vizeniz var mı? (Evet veya Hayır)");
        String cevap2 = scanner.nextLine();

        if (cevap2.equals("evet")){
            this.vizeDurumu = true;
        }
        else {
            this.vizeDurumu = false;
        }
    }

        public void yurtDisiHarciKontrol() throws HarcException{
            if (this.harc < 15){
                throw new HarcException();
            }
            else {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Yurtdışı harcı işlemi tamamlanmıştır.");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void siyasiYasakKontrol() throws SiyasiException {

            if (this.siyasiYasak == true) {
                throw new SiyasiException();

            } else {


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Siyasi yasağınız bulunmuyor.");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        public void vizeDurumuKontrol() throws VizeException{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (this.vizeDurumu == true){
            System.out.println("Vize işlemleri tamamlanmıştır!");
        }
            else{
                throw new VizeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

}







