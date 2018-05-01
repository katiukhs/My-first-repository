package lesson5;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        Random rand = new Random();
        int sumOfAllElementsFromFirstAndSecondArrays;

        int[] firstArray = new int[3];

        firstArray[0] = rand.nextInt();
        firstArray[1] = rand.nextInt();
        firstArray[2] = rand.nextInt();

        int[] secondArray = {rand.nextInt(), rand.nextInt(), rand.nextInt()};

        int firstValueOfFirstArray = firstArray[0];
        int secondValueOfFirstArray = firstArray[1];
        int thirdValueOfFirstArray = firstArray[2];

        int firstValueOfSecondArray = secondArray[0];
        int secondValueOfSecondArray = secondArray[1];
        int thirdValueOfSecondArray = secondArray[2];

        sumOfAllElementsFromFirstAndSecondArrays = (firstValueOfFirstArray + secondValueOfFirstArray
                + thirdValueOfFirstArray + firstValueOfSecondArray + secondValueOfSecondArray
                + thirdValueOfSecondArray);

        System.out.println("The sum of all numbers from both tables: " + sumOfAllElementsFromFirstAndSecondArrays);
    }
}
