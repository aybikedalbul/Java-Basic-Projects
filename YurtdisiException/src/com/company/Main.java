package com.company;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz..");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String satirlar = "---Yurtdışı Çıkış Kuralları---\n" +
                "1-Herhangi bir yasağınızın bulunmaması gerekiyor.\n" +
                "2-15Tl harç bedelinizi tam olarak yatırmanız gerekiyor.\n" +
                "3-Gideceğiniz ülkeye vizenizin bulunması gerekiyor.";
        String message = "Yurtdışı şartlarından hepsiniz sağmamanız gereklidir!";

        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("***************************");
        System.out.println(satirlar);
        System.out.println("***************************");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (true) {
            Yolcu yolcu = new Yolcu();
            System.out.println("Harç Bedeli Kontrol Ediliyor..");

            try {
                Thread.sleep(500);
                yolcu.yurtDisiHarciKontrol();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("İşlemi tekrar yapınız!");
                System.out.println("***********************************");

                continue;
            }

            System.out.println("Siyasi Yasak Kontrol Ediliyor..");
            try {
                Thread.sleep(1000);
                yolcu.siyasiYasakKontrol();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("İşlemi tekrar yapınız!");
                System.out.println("***********************************");
                continue;
            }

            System.out.println("Vize Durumu Kontrol Ediliyor..");

            try {
                Thread.sleep(1000);
                yolcu.vizeDurumuKontrol();

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("İşlemi tekrar yapınız!");
                System.out.println("***********************************");
                continue;


            }

            System.out.println("İşlemler kontrol ediliyor..");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("İşlemlerinizi tamamlanmıştır, yurt dışına çıkabilirsiniz.");
            break;

        }


    }
}