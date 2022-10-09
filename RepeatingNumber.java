import java.util.Arrays;

public class RepeatingNumber {
    public static void main(String[] args) {
        int[] list = {2,2,2,14,54,5,5,65,65,4,5,77,92,30,14};
        int[] dublicate = new int[list.length];
        int startOver = 0;


        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j && list[i] == list[j])) {
                    if (!isFind(dublicate, list[i])) {
                        dublicate[startOver++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int i : dublicate) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
        static boolean isFind(int[] arr, int value) {
            for (int i : arr) {
                if (i == value) {
                    return true;
                }
            }
            return false;
        }


}
