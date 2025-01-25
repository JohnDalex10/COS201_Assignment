import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] digits = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};
        
        // Calculate mean
        int sum = 0;
        for (int num : digits) sum += num;
        double mean = (double) sum / digits.length;
        
        // Calculate variance, then standard deviation
        double variance = 0;
        for (int num : digits) {
            variance += Math.pow(num - mean, 2);
        }
        double stdDev = Math.sqrt(variance / digits.length);
        
        // Calculate median after sorting
        Arrays.sort(digits);
        int mid = digits.length / 2;
        double median = digits.length % 2 != 0 ? digits[mid] : (digits[mid-1] + digits[mid]) / 2.0;
        
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Standard Deviation: " + stdDev);
    }
}
