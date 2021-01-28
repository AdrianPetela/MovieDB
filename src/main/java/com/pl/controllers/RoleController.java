package com.pl.controllers;

import com.pl.dbObjects.Role;
import com.pl.dbUtils.CallableStatementParameter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.sql.SQLException;

public class RoleController {
    CallableStatementParameter cspie = new CallableStatementParameter();
    private ObservableList<String> listMovie;
    private ObservableList<Role> listRole;

    @FXML
    private ComboBox<String> comboMovie;

    @FXML
    private TableView<Role> Table;

    @FXML
    private TableColumn<Role, String> Ttitle;

    @FXML
    private TableColumn<Role, String> Tfname;

    @FXML
    private TableColumn<Role, String> Tlname;

    @FXML
    private TableColumn<Role, String> Trole;

    @FXML
    void pokaz(ActionEvent event) {
        przeladuj();
    }

    @FXML
    void initialize() {
        try {
            listMovie = FXCollections.observableArrayList(cspie.titleMovie());
            listRole = FXCollections.observableArrayList(cspie.listRole("Wszystkie"));
        } catch (SQLException e) {
            System.out.println("Problem z wyswietleniem hoteli");
            e.printStackTrace();
        }
        comboMovie.setItems(listMovie);
        comboMovie.getItems().add("Wszystkie");
        Table.setItems(listRole);

        Ttitle.setCellValueFactory(new PropertyValueFactory<>("MOV_TITLE"));
        Tfname.setCellValueFactory(new PropertyValueFactory<>("ACT_FNAME"));
        Tlname.setCellValueFactory(new PropertyValueFactory<>("ACT_LNAME"));
        Trole.setCellValueFactory(new PropertyValueFactory<>("ROLE"));
    }

    void przeladuj() {
        try {
            listRole = FXCollections.observableArrayList(cspie.listRole(comboMovie.getSelectionModel().getSelectedItem().toString()));
        } catch (SQLException e) {
            System.out.println("Problem z wyswietleniem hoteli");
            e.printStackTrace();
        }
        Table.setItems(listRole);
    }

}

