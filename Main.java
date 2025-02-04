/*
NAME: Aryan Kiran Revankar 
PRN: 24070126502
BATCH: AIML 2023-27 
*/
public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Calculator calculator = new Calculator();

        // Get user choice for operation
        int choice = userInput.getOperationChoice();

        // Perform the selected operation
        switch (choice) {
            case 1:
                System.out.println("Result: " + calculator.add(userInput.getNumber(), userInput.getNumber()));
                break;
            case 2:
                System.out.println("Result: " + calculator.subtract(userInput.getNumber(), userInput.getNumber()));
                break;
            case 3:
                System.out.println("Result: " + calculator.multiply(userInput.getNumber(), userInput.getNumber()));
                break;
            case 4:
                System.out.println("Result: " + calculator.divide(userInput.getNumber(), userInput.getNumber()));
                break;
            case 5:
                break;
            case 6:
                double[] array = userInput.getArray();
                System.out.println("Sum of Array: " + calculator.sumArray(array));
                System.out.println("Mean of Array: " + calculator.meanArray(array));
                System.out.println("Variance of Array: " + calculator.varianceArray(array));
                System.out.println("Standard Deviation of Array: " + calculator.standardDeviationArray(array));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}