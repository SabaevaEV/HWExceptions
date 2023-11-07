package HW3;

import java.io.IOException;

public class Parser {
    public String[] parsingData() throws IOException {
        InputData inputdata = new InputData();
        String [] data = inputdata.inputData();

        String SurName = data[0];
        String FirstName = data[1];
        String Patronymic = data[2];
        String birthDate = data[3];
        // String phoneNumber = data[4];
        long phoneNumber = Long.parseLong(data[4]);
        // String gender = data[5];
        char gender = data[5].charAt(0);
//        //Check validate data
//        validateUserData(SurName, FirstName, Patronymic, birthDate, phoneNumber, gender);
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
