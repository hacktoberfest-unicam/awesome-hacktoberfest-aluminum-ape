package tutorial.SimpleCalculator.CarmineMarchesani_SimpleCalculator;

public class SimpleCalculator {
    public double sum(double a, double b)
    {
        return a + b;
    }
    public double subtraction(double a, double b)
    {
        return a - b;
    }
    public double multiplication(double a, double b)
    {
        return a * b;
    }
    public double division(double a, double b)
    {
        if( b == 0)
            return  Double.NaN;
        return a / b;
    }
}
