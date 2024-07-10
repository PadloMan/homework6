package app;

public class SumCalculation  {
    public static void main(String[] args) {
        int totalSum = 0;
        int runningSum = 0;

        for (int number = 1; number <= 6; number++) {
            runningSum += number;
            totalSum = number;
            System.out.println(number + ". num is " + totalSum + ", sum is " + runningSum);
        }
    }
}

