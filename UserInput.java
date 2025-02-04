import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    // Get a single number from the user
    public double getNumber() {
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }

    // Get an array from the user
    public double[] getArray() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }

    // Get the user's choice for the operation
    public int getOperationChoice() {
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci Sequence");
        System.out.println("6. Array Operations");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }
}