public class OddEven {

    // Method to check if a number is even
public static boolean isEven(int number) {
    return number % 2 == 0;
}

// Method to check if a number is odd
public static boolean isOdd(int number) {
    return number % 2 != 0;
}

public static void main(String[] args) {
    int number = 16; // Example number to check

    // Check and print whether the number is even or odd
    if (isEven(number)) {
        System.out.println(number + " is an even number.");
    } else if (isOdd(number)) {
        System.out.println(number + " is an odd number.");
    }
}

}