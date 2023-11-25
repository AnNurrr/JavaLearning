public class AverageArray {


        public static void main(String[] args) {
            // Declare an array of integers
            int[] numbers = {5, 10, 15, 20, 25};

            // Calculate the sum of the array elements
            int sum = calculateSum(numbers);

            // Calculate the average of the array elements
            double average = calculateAverage(numbers);

            // Print the sum and average
            System.out.println("Sum of the array elements: " + sum);
            System.out.println("Average of the array elements: " + average);
        }

        // Method to calculate the sum of an array of integers
        private static int calculateSum(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum;
        }

        // Method to calculate the average of an array of integers
        private static double calculateAverage(int[] array) {
            // Ensure that the array is not empty to avoid division by zero
            if (array.length == 0) {
                return 0.0;
            }

            // Calculate the sum of the array elements
            int sum = calculateSum(array);

            // Calculate the average
            return (double) sum / array.length;
        }
    }


