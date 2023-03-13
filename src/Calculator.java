public class Calculator {

    public double calc1(double x) {

        return 3 * x + 5;
    }

    public double calc2(double a, double b) {
        if (a-b ==0){
            System.out.println("Ошибка в calc2: Нельзя делить на 0");
            return -1;
        }
        else{
        return (a + b) / (a - b);
    }}
    public double calc3(double a, double x, double b) {
        if (b != 0){
        double y = (a*x/b);
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result = result * i;
        }
        return result;}
        else{
            System.out.println("Ошибка в calc3: Нельзя делить на 0");
            return -1;
        }

}}
