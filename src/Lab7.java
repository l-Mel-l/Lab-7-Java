import java.util.Scanner;
public class Lab7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значения x,a,b");
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator Сalc1 = new Calculator();

        double y1 = Сalc1.calc1(x);
        double y2 = Сalc1.calc2(a, b);
        double y3 = Сalc1.calc3(a, x, b);

        System.out.println("Значение выражения 1: " + y1);
        System.out.println("Значение выражения 2: " + y2);
        System.out.println("Значение выражения 3: " + y3);
    }
}
