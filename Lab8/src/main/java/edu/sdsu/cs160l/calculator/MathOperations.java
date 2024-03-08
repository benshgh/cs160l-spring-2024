package edu.sdsu.cs160l.calculator;

/**
 * TODO change MathOperation class so that it has a dependency on DoubleCalculator class and not SimpleCalculator
 *  what you also need to do is change the method signatures from int to double.
 *
 */
public class MathOperations {

    private Calculator<Double> calculator;

    public MathOperations() {
        // TODO change this to use DoubleCalculator
        this.calculator = new SimpleCalculator();
    }

    public double factorial(int n){
        double factorial = 1;
        for(double i=2;i<=n;i++){
            factorial = calculator.mul(factorial, i);
        }
        return factorial;
    }

    public int average(int[] arr){
        int sum=0;
        for(int i : arr){
            sum = calculator.add(sum, i);
        }

        return calculator.div(sum, arr.length);
    }

    // Make sure the second variable is int only
    // the signature should look like double power(double a, int b)
    public int power(int a, int b){
        int res = 1;
        for(int i=1;i<=b;i++){
            res = calculator.mul(res, a);
        }
        return  res;
    }

    public double midValue(double a, double b){
        double add  = calculator.add(a, b);
        double midValue = calculator.div(add, 2.0);
        return midValue;
    }

    public int fahrenheitToCelsius(int fahrenheit){
        int baseSubtraction = calculator.sub(fahrenheit, 32);
        int baseMultiplication = calculator.mul(baseSubtraction, 5);
        int baseDivision = calculator.div(baseMultiplication, 9);
        return baseDivision;
    }
}
