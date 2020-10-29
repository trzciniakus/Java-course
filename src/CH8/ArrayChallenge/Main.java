package CH8.ArrayChallenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        printArray(sortIntegers(getIntegers(5)));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " is " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integers");
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static int[] sortIntegers(int[] arrayToSort) {
        int[] sortedArray = new int[arrayToSort.length];
        for (int i = 0; i < arrayToSort.length; i++) {
            sortedArray[i] = arrayToSort[i];
        }

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

//    public static int[] sortIntegers(int[] arrayToSort) {
//        // for each element in sorted array scan input table for current maximum value
//        // that is less than last maximum value
//        // not work for duplicated values in array
//        int lastMaximum = Integer.MAX_VALUE;
//        int currentMaximum = Integer.MIN_VALUE;
//        int[] sortedArray = new int[arrayToSort.length];
//
//        for (int i = 0; i < sortedArray.length; i++) {
//            for (int j = 0; j < arrayToSort.length; j++) {
//                if (arrayToSort[j] < lastMaximum && arrayToSort[j] >= currentMaximum) {
//                    currentMaximum = arrayToSort[j];
//                }
//            }
//            sortedArray[i] = currentMaximum;
//            lastMaximum = currentMaximum;
//            currentMaximum = Integer.MIN_VALUE;
//        }
//
//        return sortedArray;
//    }
}
