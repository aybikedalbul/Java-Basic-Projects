public class HarmonicArray {

        public static void main(String[] args) {

            double value = 1.0;
            double[] list = {2,3,4,5,6,7,8,9,10};

            for (int i = 0; i < list.length; i++){
                value += (1/list[i]);
            }

            double average = list.length / value;
            System.out.println("Harmonic mean result: " + average);
        }
    }

