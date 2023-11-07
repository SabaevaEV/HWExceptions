package HW3;

import java.io.IOException;

public class ParserData {
    public String[] parsingData() throws IOException {
        InputData inputdata = new InputData();
        String [] data = inputdata.inputData();

        String lastName = data[0];
        String firstName = data[1];
        String patronymic = data[2];
        String birthDate = data[3];
        long phoneNumber = Long.parseLong(data[4]);
        char gender = data[5].charAt(0);

        validateUserData(lastName, firstName, patronymic, birthDate, phoneNumber, gender);
    }





//        //Record
//        recUserData(SurName, FirstName, Patronymic, birthDate, phoneNumber, gender);
//
//        System.out.println("User Data Successfully Saved");

}
