import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] list = {{2,3,4},{5,6,7}};
        int[][] transpose = new int[3][2];

        System.out.println("Previous series : ");

        for (int i = 0; i < list.length; i++){

            for (int j = 0; j < list[i].length; j++){

                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("************************");
        for (int i = 0; i < list.length; i++){

       for (int j = 0; j < list[i].length; j++){

            transpose[j][i] = list[i][j];
        }
        }
        System.out.println("Current series: ");

        for (int i = 0; i < transpose.length; i++){

       for (int j = 0; j < transpose[i].length; j++){

           System.out.print(transpose[i][j] + " ");
        }
            System.out.println();
        }

    }
}
