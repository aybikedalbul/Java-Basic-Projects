import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberOfMines = 0;
        boolean isWin = true;

        System.out.println("===================================");
        System.out.println("Welcome to Minesweeper Game!");
        System.out.println("===================================");


        System.out.print("Enter the number of lines: ");
        int line = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int column = scanner.nextInt();
        numberOfMines = (line*column) / 4;

        String[][] list = new String[line][column];
        int[] lineList = new int[numberOfMines];
        int[] columnList = new int[numberOfMines];


        for (int i = 0; i < numberOfMines; i++){
            int lineNumber = random.nextInt(line);
            int columnNumber = random.nextInt(line);
                list[lineNumber][columnNumber] = " * ";
                lineList[i] = lineNumber;
                columnList[i] = columnNumber;
        }
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list[i].length; j++){
                if (list[i][j] == null){
                    list[i][j] = " - ";
                }
            }
        }

        System.out.println("===================================");
        System.out.println("Location of Mines: ");
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list[i].length; j++){
                System.out.print(list[i][j]);
            }
            System.out.println();
        }


        System.out.println("===================================");
        System.out.println("Let's start the game!");

        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list[i].length; j++){
                System.out.print(" - ");
            }
            System.out.println();
        }


        while (isWin == true) {
            System.out.print("Enter a line: ");
            int line2 = scanner.nextInt();

            System.out.print("Enter a coulmn: ");
            int column2 = scanner.nextInt();


            for (int i = 0; i < numberOfMines; i++){
                if (lineList[i] == line2 && columnList[i] == column2)
                    System.out.println("Boom! You exploded! You lost the game! :(");
                isWin = false;
                break;
            }
        }

        if (isWin == true){
            System.out.println("You won! Congratulations!");
        }
        //Project under construction
    }
}
