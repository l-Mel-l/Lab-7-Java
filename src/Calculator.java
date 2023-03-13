public class Calculator {

    public double calc1(double x) {

        return 3 * x + 5;
    }

    public double calc2(double a, double b) {

        return (a + b) / (a - b);
    }
    public double calc3(double a, double x, double b) {
        double y = (a*x/b);
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result = result * i;
        }
        return result;
    }
}
