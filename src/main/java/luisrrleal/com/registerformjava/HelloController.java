package luisrrleal.com.registerformjava;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import luisrrleal.com.registerformjava.controllers.ShowPersonList;
import luisrrleal.com.registerformjava.models.Person;

import java.io.IOException;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class HelloController {

    private List<Person> people = new ArrayList<>();
    @FXML
    private Button btnCancel, btnInfo, btnSave;

    @FXML
    private TextField txtName, txtMail,txtAddress, txtCompanyName,txtPhoneNumber;

    @FXML
    private DatePicker txtBirthdate;

    @FXML
    private ComboBox cmbGender;

    @FXML
    protected void onSaveButtonClick(){
        Person person = new Person();

        person.setId(people.size()+1);
        person.setName(txtName.getText());
        person.setMail(txtMail.getText());
        person.setAddress(txtAddress.getText());
        person.setCompany(txtCompanyName.getText());
        person.setPhoneNumber(txtPhoneNumber.getText());
        Date date = Date.from(txtBirthdate.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
        person.setBirthDate(date);
        person.setGender(cmbGender.getValue().toString());

        people.add(person);
        showMessage(txtName.getText()+" has been saved successfully");
    }
    @FXML
    private void onViewButtonClick(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("show-person-list.fxml"));

        try {
            ShowPersonList showPersonList = new ShowPersonList();
            showPersonList.setPersonList(people);
            loader.setController(showPersonList);

            Parent root = loader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root, 800, 350);
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        /*
        for(Person p: people){
            System.out.println("Name: " + p.getName());
            System.out.println("Email: " + p.getMail());
            System.out.println("Address: " + p.getAddress());
        }
        */

    }

    @FXML
    private void exit(){
        System.exit(0);
    }

    private void showMessage(String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Saved");
        alert.setContentText(message);
        alert.show();
    }
}