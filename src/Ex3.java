import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Vitaliy on 22.09.2017.
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а:");
        int a = scanner.nextInt();
        System.out.println("Введите b:");
        int b = scanner.nextInt();
        System.out.println("Введите c:");
        int c = scanner.nextInt();
        System.out.println(calculate(a, b, discriminant(a, b, c)));


    }

    public static boolean isPositive(int number) {
        return (number > 0);
    }

    public static boolean isZero(int number) {
        return number == 0;
    }

    public static int discriminant(int a, int b, int c) {
        return (int) (Math.pow(b, 2) - 4 * a * c);
    }

    public static String calculate(int a, int b, int d) {
        int x1, x2;
        if (isPositive(d)) {
            x1 = (int) (-b + Math.sqrt(d)) / (2 * a);
            x2 = (int) (-b - Math.sqrt(d)) / (2 * a);
            return "Корень 1 = " + x1 + "\nКорень 2 = " + x2;
        } else if (isZero(d)) {
            x1 = (int) (-b / (2 * a));
            return "Корень 1 = " + x1;

        } else return "Дискриминант отрицательный!";
    }
}
