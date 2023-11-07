package HW3;

public class ControlData {
    public static void controlException (String lastName, String firstName, String patronymic, String birthDate, long phoneNumber, char gender){

        if(!lastName.matches("[a-zA-Z]+") || !firstName.matches("[a-zA-Z]+") || !patronymic.matches("[a-zA-Z]+"))
        {
            throw new IllegalArgumentException("Данные Ф.И.О. введены некорректно");
        }
        if(!birthDate.matches("\\d{2}.\\d{2}.\\d{4}"))
        {
            throw new IllegalArgumentException("Информация неправильного формата");
        }

        String[] dataParts = birthDate.split("\\.");
        int day = Integer.parseInt(dataParts[0]);
        int month = Integer.parseInt(dataParts[1]);

        if (day < 1 || day > 31 || month < 1 || month > 12)
        {
            throw new IllegalArgumentException("Введены неверные числа даты рождения");
        }

        if ( !String.valueOf(phoneNumber).matches("[0-9]+") )
        {
            throw new IllegalArgumentException("Введены неверные данные - Телефон");
        }

        if(!String.valueOf(gender).equalsIgnoreCase("f") && !String.valueOf(gender).equalsIgnoreCase("m"))
        {
            throw new IllegalArgumentException("Введены неверные данные - Пол");
        }
    }

}
