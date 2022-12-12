public class SumAvgArray {
    public static void main(String[] args) {
        //create integer variable called sum, set to 0
        int sum = 0;
        // create and initialise an interger array called numbers with the size of 10
        int[] numbers;
        numbers = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int i : numbers) {
            sum += (sum + numbers[i]);
            System.out.println(sum);

        /* use for loop  or for each loop to call the array and add them together
        safe it inside sum variable
         */

            // print the sum


            // calculate the average and print the average
            double average = (double) sum / numbers.length;

            System.out.println("Average is " + average);
        }
    }
}
