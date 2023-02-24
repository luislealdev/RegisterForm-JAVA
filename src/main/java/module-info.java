module luisrrleal.com.registerformjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens luisrrleal.com.registerformjava to javafx.fxml;
    opens luisrrleal.com.registerformjava.controllers;
    opens luisrrleal.com.registerformjava.models;
    exports luisrrleal.com.registerformjava;
}