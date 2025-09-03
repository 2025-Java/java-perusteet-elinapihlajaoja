package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }
        double sum = 0; 
        for (int number : arr) {
            sum += number;
        }

        return sum / arr.length;
    }
    public static int max(int[] arr) {
        if (arr.length == 0) {
           return Integer.MIN_VALUE; 
        }
        int maxValue = arr[0];
        for (int number : arr)
        if (number > maxValue) maxValue = number; 

        return maxValue; 
    }
}
