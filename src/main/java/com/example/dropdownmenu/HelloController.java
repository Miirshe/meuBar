package com.example.dropdownmenu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

public class HelloController {

    @FXML
    private AnchorPane bgAnchor;
    @FXML
    private TextField txtInput;
    @FXML
    private Button btnInsert;
    @FXML
    private Label lblprint;
    @FXML
    void GetValue(ActionEvent event) {
        lblprint.setText(String.valueOf(txtInput.getText()));
    }

    @FXML
    void OnBalck(ActionEvent event) {
        bgAnchor.setBackground(Background.fill(Paint.valueOf("black")));
        lblprint.setTextFill(Paint.valueOf("white"));
    }
    @FXML
    void OnBlue(ActionEvent event) {
        bgAnchor.setBackground(Background.fill(Paint.valueOf("blue")));
        lblprint.setTextFill(Paint.valueOf("white"));
    }
    @FXML
    void OnCopy(ActionEvent event) {
        txtInput.copy();
    }
    @FXML
    void OnCut(ActionEvent event) {
        txtInput.cut();
    }

    @FXML
    void OnDlelete(ActionEvent event) {
        txtInput.deleteNextChar();
    }
    @FXML
    void OnLarge(ActionEvent event) {
        lblprint.setFont(Font.font(50));
    }
    @FXML
    void OnMeduim(ActionEvent event) {
        lblprint.setFont(Font.font(20));
    }

    @FXML
    void OnPaste(ActionEvent event) {
        txtInput.paste();
    }

    @FXML
    void OnRed(ActionEvent event) {
        bgAnchor.setBackground(Background.fill(Paint.valueOf("red")));
        lblprint.setTextFill(Paint.valueOf("white"));
        btnInsert.setBackground(Background.fill(Paint.valueOf("white")));
        btnInsert.setTextFill(Paint.valueOf("black"));
    }
    @FXML
    void OnSmall(ActionEvent event) {
        lblprint.setFont(Font.font(14));
    }
    @FXML
    void onClose(ActionEvent event) {
        System.exit(0);
    }

}
