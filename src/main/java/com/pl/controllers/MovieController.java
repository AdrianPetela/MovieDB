package com.pl.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.sql.SQLException;
import com.pl.dbObjects.Movie;
import com.pl.dbUtils.CallableStatementParameter;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MovieController {
    CallableStatementParameter cspie = new CallableStatementParameter();
    private ObservableList<String> listYear;
    private ObservableList<Movie> listMovie;


    @FXML
    private ComboBox<String> comboYear;

    @FXML
    private TableView<Movie> Table;

    @FXML
    private TableColumn<Movie, String> Ttitle;

    @FXML
    private TableColumn<Movie, Integer> Tyear;

    @FXML
    private TableColumn<Movie, Integer> Ttime;

    @FXML
    private TableColumn<Movie, String> Tlang;

    @FXML
    private TableColumn<Movie, String> Tdate;

    @FXML
    private TableColumn<Movie, String> Tcountry;

    @FXML
    private TextField movTitle;

    @FXML
    private TextField movYear;

    @FXML
    private TextField movTime;

    @FXML
    private TextField movLang;

    @FXML
    private TextField movRel;

    @FXML
    private TextField movCountry;


    @FXML
    void pokaz(ActionEvent event) {
        przeladuj();
    }

    @FXML
    void initialize() {
        try {
            listYear = FXCollections.observableArrayList(cspie.listYear());
            listMovie = FXCollections.observableArrayList(cspie.listMovie("Wszystkie"));
            Table.setItems(listMovie);
        } catch (SQLException e) {
            System.out.println("Problem");
            e.printStackTrace();
        }
        comboYear.setItems(listYear);
        comboYear.getItems().add("Wszystkie");
        comboYear.getSelectionModel().selectLast();

        Ttitle.setCellValueFactory(new PropertyValueFactory<>("MOV_TITLE"));
        Tyear.setCellValueFactory(new PropertyValueFactory<>("MOV_YEAR"));
        Ttime.setCellValueFactory(new PropertyValueFactory<>("MOV_TIME"));
        Tlang.setCellValueFactory(new PropertyValueFactory<>("MOV_LANG"));
        Tdate.setCellValueFactory(new PropertyValueFactory<>("MOV_DT_REL"));
        Tcountry.setCellValueFactory(new PropertyValueFactory<>("MOV_REL_COUNTRY"));
    }

    @FXML
    void removeMovie(ActionEvent event) throws SQLException {
        Movie movie = Table.getSelectionModel().getSelectedItem();
        System.out.println(movie.getMOV_ID());
        cspie.removeMovie(movie.getMOV_ID());
        przeladuj();
    }

    @FXML
    void addMovie(ActionEvent event) throws SQLException {
        cspie.addMovie(movTitle.getText(), Integer.parseInt(movYear.getText()), Integer.parseInt(movTime.getText()), movLang.getText(), movRel.getText(), movCountry.getText());
        przeladuj();
    }



    void przeladuj() {
        try {
            listMovie = FXCollections.observableArrayList(cspie.listMovie(comboYear.getSelectionModel().getSelectedItem()));
        } catch (SQLException e) {
            System.out.println("Problem z wyswietleniem hoteli");
            e.printStackTrace();
        }
        Table.setItems(listMovie);
    }

}

