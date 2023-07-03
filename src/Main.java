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

        dataSum = sum(dataPoints);
        dataAverage = (double) dataSum / dataPoints.length;
        System.out.println();
        System.out.printf("The average of the data points is %s and the sum is %s.%n", dataAverage, dataSum);

        int firstInt = SafeInput.getRangedInt(in,"Enter a number", 1,100);

        int numberOfTimes = occuranceScan(dataPoints, firstInt);

        if (numberOfTimes == 1){
            System.out.printf("The value you entered, %s, appeared %s time in the array.%n", firstInt, numberOfTimes);
        }
        else {
            System.out.printf("The value you entered, %s, appeared %s times in the array.%n", firstInt, numberOfTimes);
        }

        int secondInt = SafeInput.getRangedInt(in, "Enter another number", 1,100);

        if (contains(dataPoints, secondInt)) {
            System.out.printf("Your number, %s, is in the array.%n%n", secondInt);
        }
        else {
            System.out.printf("Your number, %s, is not in the array.%n%n", secondInt);
        }

        System.out.printf("The maximum value in the array is %s and the minimum is %s.%n%n", max(dataPoints),min(dataPoints));


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

    public static int min(int[] values){
        int dataMin = values[0];

        for (int value : values) {
            if (dataMin > value) {
                dataMin = value;
            }
        }
        return dataMin;
    }
    public static int max(int[] values){
        int dataMax = values[0];

        for (int i = 0; i < values.length; i ++) {
            if (dataMax < values[i]) {
                dataMax = values[i];
            }
        }
        return dataMax;
    }

    public static int occuranceScan(int [] values, int target){
        int numberOfTimes = 0;

        for (int i = 0; i < values.length; i ++) {
            if (target == values[i]) {
                numberOfTimes += 1;
            }
        }
        return numberOfTimes;
    }

    public static int sum(int values[]){
        int valSum = 0;
        for (int i = 0; i < values.length; i++) {
            valSum += values[i];
        }
        return valSum;
    }

    public static boolean contains(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (target == values[i]) {
                return true;
            }
        }
        return false;
    }
}