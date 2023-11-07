package HW3;

import java.io.FileWriter;
import java.io.IOException;

public class RecorderData {
    public static void recorderData(String lastName, String firstName, String patronymic, String birthDate, long phoneNumber, char gender) throws IOException
    {
        String newFile = lastName + ".txt";
        try (FileWriter writer = new FileWriter (newFile, true))
        {
            writer.write("Фамилия: " + lastName + ", Имя: " + firstName + ", Отчество: " + patronymic +
                    ",  Дата рождения: " + birthDate + ", Номер телефона: " + phoneNumber + ", Под: " + gender + ";" + "\n");
        }
    }
}
