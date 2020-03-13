
import java.util.Random;


public class EvenOddCounter {
   
    public static boolean isEven(int num) {
    boolean isEvenNumber = false;

    if ((num % 2) == 0) {
        isEvenNumber = true;
    }
    return isEvenNumber;
}
    public static void main(String[] args) {

    int evenNumberCount = 0;
    int oddNumberCount = 0;

    Random randomValue = new Random();

    // Generate 100 random numbers.
    for (int i = 1; i <= 100; i++) {
        // Determine if the number was even or odd.
        if (isEven(randomValue.nextInt(i))) {
            evenNumberCount++;
        } else {
            oddNumberCount++;
        }
    }

    System.out.println("Number of even numbers: " + evenNumberCount);
    System.out.println("Number of odd numbers: " + oddNumberCount);

} 
    }

