package tutorial.SimpleCalculator.SpaceCowboyS01;

public class SimpleCalculator {
    static double sum(double x, double y) {
        return x + y;
    }
    static double diff(double x, double y) {
        return x - y;
    }
    static double product(double x, double y) {
        return x * y;
    }
    static double quotient(double x, double y) {
        if (y > 0)
            return x / y;
        return Double.NaN;
    }
    static double sqrt(double x) {
        return Math.sqrt(x);
    }
}
