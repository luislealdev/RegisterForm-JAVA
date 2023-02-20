package luisrrleal.com.registerformjava.controllers;

import luisrrleal.com.registerformjava.models.Person;

import java.util.ArrayList;
import java.util.List;

public class ShowPersonList {
    private List<Person> personList = new ArrayList<>();

    public void setPersonList(List<Person> personList){
        this.personList = personList;
    }
}
