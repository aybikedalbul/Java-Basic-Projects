import java.lang.reflect.Array;
import java.util.Arrays;

public class FrequencyArray {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] count = new int[list.length];

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length - 1; i++) {
            count[i] += 1;
        }

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (i != j && list[i] == list[j]) {

                    count[i]++;
                }
            }
        }
        System.out.println("Count Array: " + Arrays.toString(count));
        System.out.println("Repeating Numbers: ");

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++){
                if (i != j && count[i] != count[j]) {
                    System.out.println("Number " + list[i] + " repeated " + count[i] + " times.");
                    break;
                }
}
        }

    }
}