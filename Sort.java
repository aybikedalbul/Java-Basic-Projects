import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] list = new int[5];

        for (int i = 0; i < list.length; i++){
            System.out.print("Enter the " + (i+1) + ". number: ");
            list[i]  = scanner.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Ranking of the series: " + Arrays.toString(list));
    }
}
