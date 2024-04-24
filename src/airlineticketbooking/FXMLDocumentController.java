/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package airlineticketbooking;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Legion
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private AnchorPane signIn_form;
    @FXML
    private Button signin_close;

    @FXML
    private Hyperlink signin_hyperlink;

    @FXML
    private Button signin_minimize;

    @FXML
    private PasswordField signin_password;

    @FXML
    private TextField signin_username;

    @FXML
    private Button signinbtn;

    @FXML
    private Button signup_btn;

    @FXML
    private Button signup_close;

    @FXML
    private TextField signup_email;
    
    @FXML
    private AnchorPane signup_form;
    
    @FXML
    private Hyperlink signup_hyperlink;

    @FXML
    private Button signup_miniminze;

    @FXML
    private PasswordField signup_password;

    @FXML
    private TextField signup_username;
    @FXML
    private Label label;
    
    @FXML
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
    public void switchForm(ActionEvent event) {
        if(event.getSource() == signin_hyperlink){
            signIn_form.setVisible(false);
            signup_form.setVisible(true);
        } else if(event.getSource() == signup_hyperlink) {
            signIn_form.setVisible(true);
            signup_form.setVisible(false);
        }
    }
    public void signIn_close() {
        System.exit(0);
    }
    public void signIn_minimize() {
        Stage stage = (Stage)signIn_form.getScene().getWindow();
        stage.setIconified(true);
    }
    public void signUp_close() {
        System.exit(0);
    }
    public void signUp_minimize() {
        Stage stage = (Stage)signup_form.getScene().getWindow();
        stage.setIconified(true);       
    }
    public void signIn_login()throws Exception {
       signinbtn.getScene().getWindow().hide();
       Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
       Stage stage = new Stage();
       Scene scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
}
