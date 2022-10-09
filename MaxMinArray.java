import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
//        Dizi : {15,12,788,1,-1,-778,2,0}
//        Girilen Sayı : 5
//        Girilen sayıdan küçük en yakın sayı : 2
//        Girilen sayıdan büyük en yakın sayı : 12
        Scanner scanner = new Scanner(System.in);
        int[] array = {15,12,788,1,-1,-778,2,0};
        int[] newList = new int[array.length+1];
        Arrays.sort(array); // Array sıralandı.

        System.out.print("Which number do you want to choose? : ");
        int input = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            newList[i] = array[i];
            newList[newList.length -1] = input;
        }
        Arrays.sort(newList);

        System.out.print(Arrays.toString(newList) + " ");
        System.out.println();

        int number = Arrays.binarySearch(newList, input);

        System.out.println("Girdiğiniz sayıdan küçük en yakın değer: " + newList[number-1]);
        System.out.println("Girdiğiniz sayıdan büyük en yakın değer: " + newList[number+1]);





        }

    }

