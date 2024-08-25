import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class addDigit {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        System.out.println("Please enter a number: ");
    
        int sum = 0;
        
        // Calculate the sum of the digits
        int temp = Math.abs(number);  // Handle negative numbers

        System.out.println("temp: "+temp);
        
        while (temp != 0) {
            sum = sum + temp % 10;  // Add the last digit to sum
            temp = temp / 10;        // Remove the last digit
        }
        
        System.out.println("Sum of the digits: " + sum);
    }
}
