package luisrrleal.com.registerformjava.controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import luisrrleal.com.registerformjava.models.Person;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ShowPersonList implements Initializable {
    @FXML
    TableView<Person> tblPeople;
    private List<Person> personList = new ArrayList<>();

    public void setPersonList(List<Person> personList){
        this.personList = personList;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tblPeople.setItems(FXCollections.observableArrayList(personList));
    }
}
