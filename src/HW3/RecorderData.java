package HW3;

import java.io.FileWriter;
import java.io.IOException;

public class RecorderData {
    private static void Recorder(String lastName, String firstName, String patronymic, String birthDate, long phoneNumber, char gender) throws IOException
    {
        // Create fille
        String newFile = lastName + ".txt";
//        BufferedWriter writer = new BufferedWriter(new FileWriter(newFile, true)
        try (FileWriter writer = new FileWriter (newFile, true))
        {
            writer.write("Фамилия: " + lastName + ", Имя: " + firstName + ", Отчество: " + patronymic +
                    ",  Дата рождения: " + birthDate + ", Номер телефона: " + phoneNumber + ", Под: " + gender + ";" + "\n");
        }
    }
}
