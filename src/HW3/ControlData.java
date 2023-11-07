package HW3;

public class ControlData {
    private static void ControlException (String lastName, String firstName, String patronymic, String birthDate, long phoneNumber, char gender){

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
        // Validate phoneNumber (String)
        // if(!phoneNumber.matches("^\\+(\\d{1,3}(\\(\\d{1,3}\\))?)(?:[0-9] ?){6,14}[0-9]$"))
        // {
        //     throw new IllegalArgumentException("Incorrect Phone Number");
        // }
        // Validate phoneNumber (long)
        if (phoneNumber < 70000000000L || phoneNumber > 79999999999L)
        {
            throw new IllegalArgumentException("Incorrect Phone Number. The phone number should be within the range of +70000000000 to +79999999999.");
        }

        // Validate gender (Char)
        if(!String.valueOf(gender).equalsIgnoreCase("f") && !String.valueOf(gender).equalsIgnoreCase("m"))
        {
            throw new IllegalArgumentException("Incorrect gender");
        }
    }

}
