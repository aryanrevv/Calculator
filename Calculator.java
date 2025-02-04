public class Calculator {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return a / b;
    }

    // Sum of Array
    public double sumArray(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }

    // Mean of Array
    public double meanArray(double[] array) {
        return sumArray(array) / array.length;
    }

    // Variance of Array
    public double varianceArray(double[] array) {
        double mean = meanArray(array);
        double variance = 0;
        for (double num : array) {
            variance += Math.pow(num - mean, 2);
        }
        return variance / array.length;
    }

    // Standard Deviation of Array
    public double standardDeviationArray(double[] array) {
        return Math.sqrt(varianceArray(array));
    }
}