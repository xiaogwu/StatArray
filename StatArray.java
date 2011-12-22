/* Xiao G. Wu
 * CS111A - Assignment 8
 * 10/19/2001
 */

/** This class performs some simple statistical calculations */ 

public class StatArray {
    public static void main(String[] args) {

        // Constants
        final int ARRAY_SIZE = 100; // Array size
        final int INT_MIN = 1; // Minimum integer value
        final int INT_MAX = 10; // Maximum integer value

        // Create new array
        int[] numbers = new int[ARRAY_SIZE];

        // Fill array with random values from the min and max range
        fillWithRandomNumbers(numbers, INT_MIN, INT_MAX);

        // Print values of array
        printNumbers(numbers);

        // Print minimum value
        System.out.println("Minimum Value: " + findLowest(numbers));

        // Print maximum value
        System.out.println("Maximum Value: " + findHighest(numbers));

        // Print average value
        System.out.println("Average Value: " + calcAverage(numbers));

        // Print range value
        System.out.println("Range Value: " + calcRange(numbers));

    }

    /** This method fills the array with random values ranging from min to max
     * @param newArray Newly created empty array
     * @param minInt Minimum value of range
     * @param maxInt Maximum value of range
     */

    public static void fillWithRandomNumbers(int[] newArray, int minInt, int maxInt) {

        for (int iter = 0; iter < newArray.length; iter++) {
            newArray[iter] = minInt + (int)(Math.random() * ((maxInt - minInt) + 1));    
        }
    }

    /** This method iterates over the array and prints the value of each element
     * @pram numbers Numbers array
     */

    public static void printNumbers(int[] numbers) {
        for (int i : numbers) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    /** This method iterates over the array and determines the highest value
     * @param numbers Numbers array
     * @return Highest value in the array
     */

    public static int findHighest(int[] numbers) {
        int highest = numbers[0];
        for (int i : numbers) {
            highest = Math.max(highest, i);
        }
        return highest;
    }

    /** This method iterates over the array and determines the lowest value
     * @param numbers Number array
     * @return Lowest value in the array
     */

    public static int findLowest(int[] numbers) {
        int lowest = numbers[0];
        for (int i : numbers) {
            lowest = Math.min(lowest, i);
        }
        return lowest;
    }

    /** This method calculates the average of all the values in the array
     * @param numbers Numbers array
     * @return average value
     */

    public static double calcAverage(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return (double)sum / numbers.length;
    }

    /** This method calculates the range of the highest and lowest values
     * @param numbers Numbers array
     * @return range value
     */

    public static int calcRange(int[] numbers) {
        int max = findHighest(numbers);
        int min = findLowest(numbers);
        return Math.abs(max - min);
    }
}
