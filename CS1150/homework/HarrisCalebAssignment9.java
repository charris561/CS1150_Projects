package homework;

import java.util.Arrays;

/*
 * By: Caleb Harris
 * CS1150 - 001 (m/w)
 * Due: April 8, 2021
 * Assignment #9
 * Problem Statement: Write a program to manipulate arrays by creating arrays,
 * filling arrays with values, displaying arrays, combining arrays, sorting 
 * arrays, and finding a missing number. 
 * 
 * ****Psuedocode****
 * 
 * Initialize Constants for Tests Upper and Lower Bounds
 * 
 * main:
 * initialize arrays with values provided
 * combine arrays
 * sort arrays
 * find the missing number
 * display results
 * 
 * combineArrays method:
 * use for loop to copy values into new array
 * for (int i = 0; i < array.legth; i++)
 * 	{array2[i] = array1[i]}
 * 
 * findMissingNumber method:
 * findMissingNumber has the parameters (int[] array, int lower, int upper)
 * bool missingNumberFound = false;
 * i = 0;
 * sum = 0;
 * expectedLength = UPPER_BOUND - LOWER_BOUND;
 * expectedSum = expectedLength * (expectedLength + 1) / 2;
 * while (i < array.length)
 * 	{ 
 * 	sum = sum + array[i];
 * 	}
 * missingNum = sum - expectedSum;
 */

public class HarrisCalebAssignment9 {

	// set constants for upper and lower bounds for each test
	final static int UPPER_BOUND_TEST1 = 30;
	final static int LOWER_BOUND_TEST1 = 1;
	final static int UPPER_BOUND_TEST2 = 30;
	final static int LOWER_BOUND_TEST2 = 15;
	final static int UPPER_BOUND_TEST3 = 25;
	final static int LOWER_BOUND_TEST3 = 15;
	final static int UPPER_BOUND_TEST4 = 20;
	final static int LOWER_BOUND_TEST4 = 10;

	public static void main(String[] args) {

		// initialize arrays given
		// test1 data
		int[] array1 = { 9, 29, 19, 4, 15, 1, 10, 12, 28, 14, 5, 3, 21, 22, 27, 13, 2 };
		int[] array2 = { 16, 7, 18, 24, 6, 17, 8, 23, 11, 25, 26, 30 };
		// test2 data
		int[] array3 = { 29, 19, 15, 28, 21, 22, 27 };
		int[] array4 = { 16, 18, 24, 17, 23, 25, 26, 20 };
		// test3 data
		int[] array5 = { 16, 21, 18, 15, 19, 20, 25 };
		int[] array6 = { 22, 23, 17 };
		// test4 data
		int[] array7 = { 16, 20, 18, 14, 19, 13 };
		int[] array8 = { 11, 15, 17, 12 };

		// combines arrays into 1 array and sorts them
		int[] test1_CombinedArray = combineArrays(array1, array2);
		Arrays.sort(test1_CombinedArray);
		int[] test2_CombinedArray = combineArrays(array3, array4);
		Arrays.sort(test2_CombinedArray);
		int[] test3_CombinedArray = combineArrays(array5, array6);
		Arrays.sort(test3_CombinedArray);
		int[] test4_CombinedArray = combineArrays(array7, array8);
		Arrays.sort(test4_CombinedArray);

		// finds the missing number
		int test1_MissingNumber = findMissingNumber(test1_CombinedArray, LOWER_BOUND_TEST1, UPPER_BOUND_TEST1);
		int test2_MissingNumber = findMissingNumber(test2_CombinedArray, LOWER_BOUND_TEST2, UPPER_BOUND_TEST2);
		int test3_MissingNumber = findMissingNumber(test3_CombinedArray, LOWER_BOUND_TEST3, UPPER_BOUND_TEST3);
		int test4_MissingNumber = findMissingNumber(test4_CombinedArray, LOWER_BOUND_TEST4, UPPER_BOUND_TEST4);

		// displays the array and missing number
		// test1
		System.out
				.printf("**************************************\nTest1\n" + "**************************************\n");
		displayArray(test1_CombinedArray);
		System.out.printf("The missing number is: %d\n", test1_MissingNumber);
		// test2
		System.out.printf(
				"\n**************************************\nTest2\n" + "**************************************\n");
		displayArray(test2_CombinedArray);
		System.out.printf("The missing number is: %d\n", test2_MissingNumber);
		// test3
		System.out.printf(
				"\n**************************************\nTest3\n" + "**************************************\n");
		displayArray(test3_CombinedArray);
		System.out.printf("The missing number is: %d\n", test3_MissingNumber);
		// test4
		System.out.printf(
				"\n**************************************\nTest4\n" + "**************************************\n");
		displayArray(test4_CombinedArray);
		System.out.printf("The missing number is: %d\n", test4_MissingNumber);

	} // end main

	// combines arrays into 1 new array
	public static int[] combineArrays(int[] array1, int[] array2) {

		int[] combinedArray = new int[array1.length + array2.length];

		for (int i = 0; i < array1.length; i++) {
			combinedArray[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			combinedArray[i + array1.length] = array2[i];
		}

		return combinedArray;
	} // end combineArrays

	// displays arrays
	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Array [%d]= %d\n", i, array[i]);
		}
	} // end displayArray

	// finds the missing number
	public static int findMissingNumber(int[] array, int lower, int upper) {

		int sum = 0;
		double expectedSum = ((double) (array.length + 1) / 2) * (lower + upper);

		for (int i = 0; i < array.length; i++) {
			sum = array[i] + sum;
		}

		int missingNumber = (int) expectedSum - sum;

		return missingNumber;
	} // end findMissingNumber

}
