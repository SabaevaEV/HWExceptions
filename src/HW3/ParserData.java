package HW3;

import java.io.IOException;

import static HW3.ControlData.controlException;
import static HW3.RecorderData.recorderData;

public class ParserData {
    public void parsingData() throws IOException {
       try {
           InputData inputdata = new InputData();
           String[] data = inputdata.inputData();

           String lastName = data[0];
           String firstName = data[1];
           String patronymic = data[2];
           String birthDate = data[3];
           long phoneNumber = Long.parseLong(data[4]);
           char gender = data[5].charAt(0);

           controlException(lastName, firstName, patronymic, birthDate, phoneNumber, gender);
           recorderData(lastName, firstName, patronymic, birthDate, phoneNumber, gender);
           System.out.println("Данные успешно записаны");
       } catch (NullPointerException e) {
           throw new NullPointerException("Данные не сохранены, введены не все данные");
       }catch (NumberFormatException e){
           throw new NumberFormatException( "Введены неверные данные");
       }
    }

}
