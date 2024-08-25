import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class sumnaturalnumber {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Pls Enter the nth Number ");
        int total=0;
        int num = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= num; i++) {
            total = total + i;
        }
        System.out.println("Sum of first " + (int) num + " natural numbers is: " + total);
    }
}

// public class sumnaturalnumber {
//     public static void main(String[] args) throws IOException {

//         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Pls Enter the nth Number ");
//         double n = Integer.parseInt(reader.readLine());

//         double total = (n * (n + 1)) / 2;

//         System.out.println("sum of first 10 natural numbers is :" + total);
//     }
// }
