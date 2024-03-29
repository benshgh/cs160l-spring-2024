package edu.sdsu.cs160l.calculator;

public class MathOperations {

    private Calculator calculator;

    public MathOperations() {
        this.calculator = new SimpleCalculator();
    }

    public int factorial(int n){
        int factorial = 1;
        for(int i=2;i<=n;i++){
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

    public int power(int a, int b){
        int res = 1;
        for(int i=1;i<=b;i++){
            res = calculator.mul(res, a);
        }
        return  res;
    }

    public int midValue(int a, int b){
        int add  = calculator.add(a, b);
        int midValue = calculator.div(add, 2);
        return midValue;
    }

    public int fahrenheitToCelsius(int fahrenheit){
        int baseSubtraction = calculator.sub(fahrenheit, 32);
        int baseMultiplication = calculator.mul(baseSubtraction, 5);
        int baseDivision = calculator.div(baseMultiplication, 9);
        return baseDivision;
    }
}
