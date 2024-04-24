/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package airlineticketbooking;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Legion
 */
public class FXMLDashBoardConstroller implements Initializable {

    /**
     * Initializes the controller class.
     */
     @FXML
    private Button availableAirplane_Btn;

    @FXML
    private DatePicker availableAirplane_Date;

    @FXML
    private Button availableAirplane_addBtn;

    @FXML
    private TextField availableAirplane_airplaneID;

    @FXML
    private TreeTableColumn<?, ?> availableAirplane_airplaneIDTable;

    @FXML
    private TreeTableColumn<?, ?> availableAirplane_dateTable;

    @FXML
    private Button availableAirplane_deleteBtn;

    @FXML
    private AnchorPane availableAirplane_form;

    @FXML
    private TextField availableAirplane_location;

    @FXML
    private TreeTableColumn<?, ?> availableAirplane_locationTable;

    @FXML
    private TextField availableAirplane_price;

    @FXML
    private TreeTableColumn<?, ?> availableAirplane_priceTable;

    @FXML
    private Button availableAirplane_resetBtn;

    @FXML
    private TextField availableAirplane_search;

    @FXML
    private ComboBox<?> availableAirplane_status;

    @FXML
    private TreeTableView<?> availableAirplane_tableView;

    @FXML
    private TreeTableColumn<?, ?> availableAirplane_typeTable;

    @FXML
    private Button availableAirplane_updateBtn;

    @FXML
    private Button bookingTicket_Btn;

    @FXML
    private ComboBox<?> bookingTicket_airplaneID;

    @FXML
    private DatePicker bookingTicket_customerDate;

    @FXML
    private TextField bookingTicket_customerFirstName;

    @FXML
    private ComboBox<?> bookingTicket_customerGender;

    @FXML
    private TextField bookingTicket_customerLastName;

    @FXML
    private TextField bookingTicket_customerPhoneNum;

    @FXML
    private AnchorPane bookingTicket_form;

    @FXML
    private ComboBox<?> bookingTicket_location;

    @FXML
    private Button bookingTicket_payBtn;

    @FXML
    private Button bookingTicket_receiptBtn;

    @FXML
    private Button bookingTicket_resetBtn;

    @FXML
    private Button bookingTicket_selectBtn;

    @FXML
    private Label bookingTicket_selectedAirplaneID;

    @FXML
    private Label bookingTicket_selectedCustomerDate;

    @FXML
    private Label bookingTicket_selectedCustomerFirstName;

    @FXML
    private Label bookingTicket_selectedCustomerGender;

    @FXML
    private Label bookingTicket_selectedCustomerLastName;

    @FXML
    private Label bookingTicket_selectedCustomerPhoneNum;

    @FXML
    private Label bookingTicket_selectedLocation;

    @FXML
    private Label bookingTicket_selectedTicketNum;

    @FXML
    private Label bookingTicket_selectedType;

    @FXML
    private ComboBox<?> bookingTicket_ticketNum;

    @FXML
    private Label bookingTicket_toalBill;

    @FXML
    private ComboBox<?> bookingTicket_type;

    @FXML
    private Button close_btn;

    @FXML
    private TreeTableColumn<?, ?> customer_AirplaneNum;

    @FXML
    private TreeTableColumn<?, ?> customer_LastName;

    @FXML
    private TreeTableColumn<?, ?> customer_PhoneNum;

    @FXML
    private TreeTableColumn<?, ?> customer_TicketNum;

    @FXML
    private Button customer_addBtn;

    @FXML
    private TreeTableColumn<?, ?> customer_customerNum;

    @FXML
    private TreeTableColumn<?, ?> customer_date;

    @FXML
    private DatePicker customer_dateChoose;

    @FXML
    private Button customer_deleteBtn;

    @FXML
    private TextField customer_firstNameField;

    @FXML
    private TreeTableColumn<?, ?> customer_fistName;

    @FXML
    private TreeTableColumn<?, ?> customer_gender;

    @FXML
    private ComboBox<?> customer_genderChoose;

    @FXML
    private TextField customer_lastNameField;

    @FXML
    private TextField customer_phoneNumField;

    @FXML
    private Button customer_resetBtn;

    @FXML
    private TextField customer_search;

    @FXML
    private ComboBox<?> customer_statusChoose;

    @FXML
    private TreeTableView<?> customer_tableView;

    @FXML
    private Button customer_updateBtn;

    @FXML
    private Button customers_Btn;

    @FXML
    private AnchorPane customers_form;

    @FXML
    private Button dashBoard_Btn;

    @FXML
    private AnchorPane dashBoard_form;

    @FXML
    private AnchorPane dashboard_availableAirplanes;

    @FXML
    private Label dashboard_availableAirplanesNum;

    @FXML
    private AreaChart<?, ?> dashboard_incomChart;

    @FXML
    private AnchorPane dashboard_todayIncome;

    @FXML
    private Label dashboard_todayIncomeNum;

    @FXML
    private AnchorPane dashboard_totalIncome;

    @FXML
    private Label dashboard_totalIncomeNum;

    @FXML
    private AnchorPane main_form;

    @FXML
    private Button minimize_btn;

    @FXML
    private Button signout_btn;
    public void close() {
        System.exit(0);
    }
    public void minimize() {
        Stage stage = (Stage)main_form.getScene().getWindow();
        stage.setIconified(true);
    }
    public void switchForm(ActionEvent event) {
        if(event.getSource() == dashBoard_Btn){
            dashBoard_form.setVisible(true);
            availableAirplane_form.setVisible(false);
            bookingTicket_form.setVisible(false);
            customers_form.setVisible(false);
        } else if(event.getSource() == availableAirplane_Btn) {
            dashBoard_form.setVisible(false);
            availableAirplane_form.setVisible(true);
            bookingTicket_form.setVisible(false);
            customers_form.setVisible(false);
        } else if(event.getSource() == bookingTicket_Btn) {
            dashBoard_form.setVisible(false);
            availableAirplane_form.setVisible(false);
            bookingTicket_form.setVisible(true);
            customers_form.setVisible(false);
        } else if(event.getSource() == customers_Btn) {
            dashBoard_form.setVisible(false);
            availableAirplane_form.setVisible(false);
            bookingTicket_form.setVisible(false);
            customers_form.setVisible(true);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
