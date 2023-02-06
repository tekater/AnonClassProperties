package anonCalculator;

public class Main {
    public static void main(String[] args) {
        CalculatorWrapper calculator = new CalculatorWrapper();
        calculator.anonymousCalculator.sum(5,20);
        calculator.anonymousCalculator.subtraction(5,20);

    }
}
