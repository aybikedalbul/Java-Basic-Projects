import java.util.Scanner;

public class BurcProgrami {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğduğunuz ay: ");
        String ay = scanner.nextLine();

        System.out.print("Doğduğunuz gün: ");
        int gun = scanner.nextInt();

       if (ay.equals("ocak")){
           if (gun >= 1 && gun <= 21) {
               System.out.println("Oğlak Burcusunuz!");
           }
           else if (gun >= 22 && gun <= 31){
               System.out.println("Kova Burcusunuz!");
           }
           else {
               System.out.println("Yanlış gün sayısı girdiniz!");
           }
       }


       if (ay.equals("şubat")){
           if (gun >= 1 && gun <= 19) {
               System.out.println("Kova Burcusunuz!");
           }
           else if (gun >= 20 && gun <= 28){
               System.out.println("Balık Burcusunuz!");
           }
           else {
               System.out.println("Yanlış gün sayısı girdiniz!");
           }
       }


       if (ay.equals("mart")){
           if (gun >= 1 && gun <= 20) {
               System.out.println("Balık Burcusunuz!");
           }
           else if (gun >= 21 && gun <= 31){
               System.out.println("Koç Burcusunuz!");
           }
           else {
               System.out.println("Yanlış gün sayısı girdiniz!");
           }
       }


       if (ay.equals("nisan")){
           if (gun >= 1 && gun <= 20) {
               System.out.println("Koç Burcusunuz!");
           }
           else if (gun >= 21 && gun <= 30){
               System.out.println("Boğa Burcusunuz!");
           }
           else {
               System.out.println("Yanlış gün sayısı girdiniz!");
           }
       }


       if (ay.equals("mayıs")){
           if (gun >= 1 && gun <= 21) {
               System.out.println("Boğa Burcusunuz!");
           }
           else if (gun >= 22 && gun <= 31){
               System.out.println("İkizler Burcusunuz!");
           }
           else {
               System.out.println("Yanlış gün sayısı girdiniz!");
           }
       }


       if (ay.equals("haziran")){
           if (gun >= 1 && gun <= 22) {
               System.out.println("İkizler Burcusunuz!");
           }
           else if (gun >= 23 && gun <= 30){
               System.out.println("Yengeç Burcusunuz!");
           }
           else {
               System.out.println("Yanlış gün sayısı girdiniz!");
           }
       }


       if (ay.equals("temmuz")){
           if (gun >= 1 && gun <= 22) {
               System.out.println("Yengeç Burcusunuz!");
           }
           else if (gun >= 23 && gun <= 31){
               System.out.println("Aslan Burcusunuz!");
           }
           else {
               System.out.println("Yanlış gün sayısı girdiniz!");
           }
       }


       if (ay.equals("ağustos")){
           if (gun >= 1 && gun <= 22) {
               System.out.println("Aslan Burcusunuz!");
           }
           else if (gun >= 23 && gun <= 30){
               System.out.println("Başak Burcusunuz!");
           }
           else {
               System.out.println("Yanlış gün sayısı girdiniz!");
           }
       }


       if (ay.equals("eylül")){
           if (gun >= 1 && gun <= 22) {
               System.out.println("Başak Burcusunuz!");
           }
           else if (gun >= 23 && gun <= 31){
               System.out.println("Terazi Burcusunuz!");
           }
           else {
               System.out.println("Yanlış gün sayısı girdiniz!");
           }
       }


       if (ay.equals("ekim")){
           if (gun >= 1 && gun <= 22) {
               System.out.println("Terazi Burcusunuz!");
           }
           else if (gun >= 23 && gun <= 30){
               System.out.println("Akrep Burcusunuz!");
           }
           else {
               System.out.println("Yanlış gün sayısı girdiniz!");
           }
       }


       if (ay.equals("kasım")){
           if (gun >= 1 && gun <= 21) {
               System.out.println("Akrep Burcusunuz!");
           }
           else if (gun >= 22 && gun <= 31){
               System.out.println("Yay Burcusunuz!");
           }
           else {
               System.out.println("Yanlış gün sayısı girdiniz!");
           }
       }


       if (ay.equals("aralık")){
           if (gun >= 1 && gun <= 21) {
               System.out.println("Yay Burcusunuz!");
           }
           else if (gun >= 22 && gun <= 30){
               System.out.println("Oğlak Burcusunuz!");
           }
           else {
               System.out.println("Yanlış gün sayısı girdiniz!");
           }
       }


    }
}
