import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        double dataAverage;
        int dataSum = 0;

        int[] dataPoints = new int[100];
        for (int i = 0; i < dataPoints.length; i ++){
            dataPoints[i] = rnd.nextInt(100)+1;
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

        int firstInt = SafeInput.getRangedInt(in,"Enter a number", 1,100);
        int numberOfTimes = 0;

        for (int dataPoint : dataPoints) {
            if (firstInt == dataPoint) {
                numberOfTimes += 1;
            }
        }

        if (numberOfTimes == 1){
            System.out.printf("The value you entered, %s, appeared %s time in the array.%n", firstInt, numberOfTimes);
        }
        else {
            System.out.printf("The value you entered, %s, appeared %s times in the array.%n", firstInt, numberOfTimes);
        }

        int secondInt = SafeInput.getRangedInt(in, "Enter another number", 1,100);

        int dataPos = -1;

        for (int i = 0; i < dataPoints.length; i ++){
            if (secondInt == dataPoints[i]){
                dataPos = i;
                System.out.printf("The value you entered, %s, was found first in position %s.%n%n", secondInt, dataPos);
                break;
            }
        }

        if (dataPos == -1) {
            System.out.printf("The value you entered, %s, was not found in the array.%n%n", secondInt);
        }

        int dataMin = dataPoints[0];
        int dataMax = dataPoints[0];

        for (int dataPoint : dataPoints) {
            if (dataMin > dataPoint) {
                dataMin = dataPoint;
            }
            if (dataMax < dataPoint) {
                dataMax = dataPoint;
            }
        }

        System.out.printf("The maximum value in the array is %s and the minimum is %s.%n%n", dataMax,dataMin);


        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int[] values) {
        double valAverage;
        double valSum = 0;
        for (int value : values) {
            valSum += value;
        }
        valAverage = valSum/values.length;
        return valAverage;
    }
}