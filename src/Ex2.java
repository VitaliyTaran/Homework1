import java.util.Scanner;

/**
 * Created by Vitaliy on 21.09.2017.
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину первого дома:");
        int firstHouseLength = scanner.nextInt();
        System.out.println("Введите ширину первого дома:");
        int firstHouseWidth = scanner.nextInt();
        System.out.println("Введите длину второго дома:");
        int secondHouseLength = scanner.nextInt();
        System.out.println("Введите ширину ворого дома:");
        int secondHouseWidth = scanner.nextInt();
        System.out.println("Введите длину участка:");
        int lengthOfSector = scanner.nextInt();
        System.out.println("Введите ширину участка:");
        int widthOfSector = scanner.nextInt();
        if ((firstHouseLength <= lengthOfSector) && (firstHouseWidth <= widthOfSector) && (secondHouseLength <= lengthOfSector) && (secondHouseWidth <= widthOfSector)){
            if (((firstHouseLength + secondHouseLength <= lengthOfSector) || (firstHouseWidth + secondHouseWidth <= widthOfSector))
                    ||((firstHouseWidth + secondHouseLength <= widthOfSector) && ((firstHouseLength <= lengthOfSector) && (secondHouseLength <= lengthOfSector)))
                    || ((firstHouseLength + secondHouseWidth <= lengthOfSector) && (firstHouseWidth + secondHouseLength <= widthOfSector ))) {
                System.out.println("Первый дом размером " + firstHouseLength + " на " + firstHouseWidth + " и второй дом размером " + secondHouseLength
                        + " на " + secondHouseWidth + " Могут разместиться на участке размером " + lengthOfSector + " на " + widthOfSector);
            }else System.out.println("Два дома не могут быть помещены на данный участок");

        } else System.out.println("Два дома не могут быть помещены на данный участок");
    }

}
