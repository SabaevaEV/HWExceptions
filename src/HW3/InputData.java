package HW3;

import java.io.IOException;
import java.util.Scanner;

public class InputData {
    public String[] inputData() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите следующие данные через пробел: \n"
                    + "Фамилия Имя Отчество, дату рождения в формате - dd.mm.yyyy, номер телефона - цифры, пол - f/m :");
            String inputData = scanner.nextLine();
            String[] arrayData = inputData.split(" ");
            if (arrayData.length != 6) {
                throw new IllegalArgumentException("Введено неверное количество данных, повторите ввод");
            }
            return arrayData;
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка " + e.getMessage());
        }
        return null;
    }

}
