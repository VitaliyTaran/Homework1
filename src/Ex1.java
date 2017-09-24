import java.util.Scanner;

/**
 * Created by Vitaliy on 22.09.2017.
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день");
        int numberOfDay = scanner.nextInt();
        System.out.println("Введие месяц");
        int numberOfMonth = scanner.nextInt();
        System.out.println("Введите год");
        int year = scanner.nextInt();

        if (numberOfDay <=31 && numberOfDay > 0 && numberOfMonth > 0 && numberOfMonth <= 12 ){
            if ((isThirtyDaysInMonth(numberOfMonth)&& numberOfDay <= 30)
                    || (isThirtyOneDaysInMonth(numberOfMonth)&& numberOfDay <= 31)
                    || (isTwentiNineDaysInMonth(numberOfMonth, year) && numberOfDay <= 29)
                    ||(!isTwentiNineDaysInMonth(numberOfMonth, year) && numberOfDay <= 28)){
                System.out.println("Текущая дата: " + numberOfDay + "." + numberOfMonth + "." + year );
                System.out.print("Следующая дата: ");
                System.out.println(calculate(numberOfDay,numberOfMonth,year));
            }else System.out.println("Введены некорректные данные!");
        }else System.out.println("Введены некорректные данные!");



    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    public static boolean isThirtyDaysInMonth (int numberOfMonth){
        return (numberOfMonth == 4 || numberOfMonth == 6 || numberOfMonth == 9 || numberOfMonth == 11);
    }
    public static boolean isThirtyOneDaysInMonth (int numberOfMonth){
        return (numberOfMonth == 1 || numberOfMonth == 3 || numberOfMonth == 5 || numberOfMonth == 7 || numberOfMonth == 8 || numberOfMonth == 10 || numberOfMonth == 12);
    }
    public static boolean isTwentiNineDaysInMonth (int numberOfMonth, int year){
        return (numberOfMonth == 2 && isLeapYear(year));
    }
    public static String calculate (int numberOfDay, int numberOfMonth, int year){
        if (numberOfDay == 30 && isThirtyDaysInMonth(numberOfMonth)){
            ++numberOfMonth;
            numberOfDay = 1;
        }else if (numberOfDay == 31 && isThirtyOneDaysInMonth(numberOfMonth)){
            numberOfDay = 1;
            if (numberOfMonth == 12){
                ++year;
                numberOfMonth = 1;
            }else ++numberOfMonth;
        }else if ((numberOfDay == 29 && isTwentiNineDaysInMonth(numberOfMonth,year))
                ||(numberOfDay == 28 && !isTwentiNineDaysInMonth(numberOfMonth,year))){
            ++numberOfMonth;
            numberOfDay = 1;
        }else {
            ++numberOfDay;
        }
        return numberOfDay + "." + numberOfMonth + "." + year;
    }
}
