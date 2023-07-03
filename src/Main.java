import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        double dataAverage;
        int dataSum = 0;

        int[] dataPoints = new int[100];
        for (int i = 0; i < dataPoints.length; i ++){
            dataPoints[i] = rnd.nextInt(1,100);
        }

        for (int dataPoint : dataPoints) {
            System.out.printf("%s | ", dataPoint);
        }

        for (int dataPoint : dataPoints) {
            dataSum += dataPoint;
        }

        dataAverage = (double) dataSum / dataPoints.length;
        System.out.println();
        System.out.printf("The average of the data points is %s and the sum is %s.%n", dataAverage, dataSum);
    }
}