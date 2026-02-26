import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        System.out.print("How many numbers? ");
        int total = scanner.nextInt();

        for (int i = 1; i <= total; i++) {
            System.out.print("Enter number " + i + ": ");
            sum += scanner.nextDouble();
            count++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / count));
    }
}