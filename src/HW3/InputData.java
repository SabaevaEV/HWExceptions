package HW3;

import java.io.IOException;
import java.util.Scanner;

public class InputData {
    public String[] inputData() throws IOException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите следующие данные через пробел: \n "
                    + "Фамилия Имя Отчество, дату рождения в формате - dd.mm.yyyy, номер телефона - цифры, пол - f/m ): ");
            String inputData = scanner.nextLine();
            String[] arrayData = inputData.split(" ");
            if (arrayData.length != 6){
                throw new IllegalArgumentException("Введено неверное количество данных, повторите ввод");
            }
            return arrayData;
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка" + e.getMessage());
        } finally
        {
            scanner.close();
        }
        return null;
    }



//    // Create scanner
//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the data in format: SurName, FirstName, Patronymic, Date of birth, Phone Number, You gender: M or F");
//    String inputScanner = scanner.nextLine();
//    //Check userData to 6
//        try {
//        // Split string
//        String[] userData = inputScanner.trim().split(" ");
//        // Cheak to correct number of fields
//        if (userData.length != 6)
//        {
//            throw new IllegalArgumentException
//                    ("The incorrect number of fields is filled in, please fill in the correct number of fields, which should not exceed six or be less than six.");
//        }
//        // Add userData
//        String SurName = userData[0];
//        String FirstName = userData[1];
//        String Patronymic = userData[2];
//        String birthDate = userData[3];
//        // String phoneNumber = userData[4];
//        long phoneNumber = Long.parseLong(userData[4]);
//        // String gender = userData[5];
//        char gender = userData[5].charAt(0);
//        //Check validate userData
//        validateUserData(SurName, FirstName, Patronymic, birthDate, phoneNumber, gender);
//        //Record userData
//        recUserData(SurName, FirstName, Patronymic, birthDate, phoneNumber, gender);
//
//        System.out.println("User Data Successfully Saved");
//    }
//        catch (IllegalArgumentException e)
//    {
//        System.out.println("Error: " + e.getMessage());
//    }
//        catch (IOException e)
//    {
//        System.out.println("Error: Record or Read file");
//        e.printStackTrace();
//    }
//        finally
//    {
//        scanner.close();
//    }
}
