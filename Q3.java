package COS201;
import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] values = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};
        
        // Calculate mean
        int sum = 0;
        for (int num : values) sum += num;
        double mean = (double) sum / values.length;
        
        // Calculate median
        double variance = 0;
        for (int num : values) {
            variance += Math.pow(num - mean, 2);
        }
        double stdDev = Math.sqrt(variance / values.length);
        
        Arrays.sort(values);
        int mid = values.length / 2;
        double median = values.length % 2 != 0 ? values[mid] : (values[mid-1] + values[mid]) / 2.0;
        
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Standard Deviation: " + stdDev);
    }
}