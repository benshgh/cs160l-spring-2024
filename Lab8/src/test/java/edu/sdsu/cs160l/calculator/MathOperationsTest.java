package edu.sdsu.cs160l.calculator;

public class MathOperations {

    private Calculator<Double> calculator;

    public MathOperations() {
        // TODO change this to use DoubleCalculator
        //this.calculator = new DoubleCalculator();
    }

    public double factorial(int n){
        double factorial = 1;
        for(double i=2;i<=n;i++){
            factorial = calculator.mul(factorial, i);
        }
        return factorial;
    }

    public double average(double[] arr){
        double sum=0;
        for(double i : arr){
            sum = calculator.add(sum, i);
        }

        return calculator.div(sum, Double.valueOf(arr.length));
    }

    // Make sure the second variable is int only
    // the signature should look like double power(double a, int b)
    public double power(double a, int b){
        double res = 1;
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

    public double fahrenheitToCelsius(double fahrenheit){
        double baseSubtraction = calculator.sub(fahrenheit, 32.0);
        double baseMultiplication = calculator.mul(baseSubtraction, 5.0);
        double baseDivision = calculator.div(baseMultiplication, 9.0);
        return baseDivision;
    }
}