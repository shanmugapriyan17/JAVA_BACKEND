package src;

public class ATM  {
    public static void main(String[] args) {
        // An example array of numbers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Counter to keep track of how many numbers have been printed
        int count = 0;

        // Loop through the array
        for (int num : numbers) {
            // If count reaches 4, break the loop
            if (count == 4) {
                break;
            }
            // Print the number and increment the count
            System.out.println(num);
            count++;
        }
    }
}
