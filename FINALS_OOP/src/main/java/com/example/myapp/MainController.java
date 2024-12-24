package com.example.myapp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.io.OptionalDataException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class MainController {
    @FXML
    private TitledPane dipPane;
    @FXML
    private TitledPane benchPane;
    @FXML
    private TitledPane inclinePane;
    @FXML
    private TitledPane pressPane;
    @FXML
    private TitledPane pecPane;
    @FXML
    private TitledPane flyPane;
    @FXML
    private TitledPane crossPane;
    @FXML
    private TitledPane pushPane;
    @FXML
    private Tab backTab;
    @FXML
    private Tab chestTab;
    @FXML
    private Tab armsTab;
    @FXML
    private Tab shouldersTab;
    @FXML
    private Tab legsTab;
    @FXML
    private Tab coreTab;
    @FXML
    private TitledPane milestoneFive;
    @FXML
    private TitledPane milestoneFour;
    @FXML
    private TitledPane milestoneThree;
    @FXML
    private TitledPane milestoneTwo;
    @FXML
    private TitledPane milestoneOne;
    @FXML
    private TabPane mainTabPane;
    @FXML
    private Tab blankTab;
    @FXML
    private Tab exercisesTab;
    @FXML
    private Tab profileTab;
    @FXML
    private Tab recordsTab;
    @FXML
    private Tab coachTab;

    @FXML
    private Accordion MilestoneAccordion;
    @FXML
    private TextArea textAreaAI;
    @FXML
    private Label grandTotalLabel;
    @FXML
    private  Button pushdownBtn;
    @FXML
    private Button pecDec;
    @FXML
    private Button pressBtn;
    @FXML
    private Button inclineBtn;
    @FXML
    private TextField txtPullWeight;

    @FXML
    private TextField txtPullSets;

    @FXML
    private TextField txtBandSets;

    @FXML
    private TextField txtBandWeight;

    @FXML
    private Button bandBtn;

    @FXML
    private Button CableRowBtn;

    @FXML
    private Label ageLabel;

    @FXML
    private Button barbellBtn;

    @FXML
    private Button bicepCurlBtn;

    @FXML
    private Button cableFlyBtn;

    @FXML
    private Button chestDiptBtn;


    @FXML
    private Button crossBtn;

    @FXML
    private Button deadliftBtn;

    @FXML
    private Button declineBtn;

    @FXML
    private Button deleteBtn;

    @FXML
    private Button dumbbellRowBtn;


    @FXML
    private Button extensionBtn;

    @FXML
    private Button externalBtn;

    @FXML
    private Button hamstringBtn;

    @FXML
    private Button hangingBtn;

    @FXML
    private Label heightLabel;

    @FXML
    private Button hipBtn;

    @FXML
    private Button inclineBicepBtn;


    @FXML
    private Button kickbackBtn;

    @FXML
    private Button landmineBtn;

    @FXML
    private Button latPulldownBtn;

    @FXML
    private Button lateralRaiseBtn;

    @FXML
    private Button legPressBtn;

    @FXML
    private Button medicineBtn;

    @FXML
    private Button militaryBtn;

    @FXML
    private Label nameLabel;

    @FXML
    private Button pistolBtn;

    @FXML
    private Button plankBtn;

    @FXML
    private Button plateBtn;

    @FXML
    private Button pullUpBtn;

    @FXML
    private Button pushUpBtn;


    @FXML
    private Button pushUpBtn2;

    @FXML
    private RadioButton rbFemale;

    @FXML
    private RadioButton rbMale;

    @FXML
    private Button recordBenchPress;

    @FXML
    private Button refreshBtn;

    @FXML
    private Button reverseBtn;

    @FXML
    private Button seatedRowBtn;

    @FXML
    private Button setDetailsBtn;

    @FXML
    private Button shoulderPressBtn;

    @FXML
    private Button sideBtn;

    @FXML
    private Button situpBtn;

    @FXML
    private Button submitBtn;

    @FXML
    private Button tricepDipsBtn;

    @FXML
    private TextField txtBarbellSets;

    @FXML
    private TextField txtBarbellWeight;

    @FXML
    private TextField txtBenchSets;

    @FXML
    private TextField txtBenchWeight;

    @FXML
    private TextField txtBicepSets;

    @FXML
    private TextField txtBicepWeight;

    @FXML
    private TextField txtCableRowSets;

    @FXML
    private TextField txtCableRowWeight;

    @FXML
    private TextField txtCrossSets;

    @FXML
    private TextField txtCrossWeight;

    @FXML
    private TextField txtDeadliftSets;

    @FXML
    private TextField txtDeadliftWeight;

    @FXML
    private TextField txtDecilneSecs;

    @FXML
    private TextField txtDipSets;

    @FXML
    private TextField txtDipWeight;

    @FXML
    private TextField txtDumbbellSets;

    @FXML
    private TextField txtDumbbellWeight;

    @FXML
    private TextField txtEnteralWeight;

    @FXML
    private TextField txtExtensionWeight;

    @FXML
    private TextField txtExtensionsets;

    @FXML
    private TextField txtExternalSets;

    @FXML
    private TextField txtFlySets;

    @FXML
    private TextField txtFlyWeight;

    @FXML
    private TextField txtGoal;

    @FXML
    private TextField txtHamstringSets;

    @FXML
    private TextField txtHamstringWeight;

    @FXML
    private TextField txtHangingSec;

    @FXML
    private TextField txtHeight;

    @FXML
    private TextField txtHipSets;

    @FXML
    private TextField txtHipWeight;

    @FXML
    private TextField txtInclineBicepSets;

    @FXML
    private TextField txtInclineBicepWeight;

    @FXML
    private TextField txtInclineSets;

    @FXML
    private TextField txtInclineWeight;

    @FXML
    private TextField txtKickbackSets;

    @FXML
    private TextField txtKickbackWeight;

    @FXML
    private TextField txtLandmineSets;

    @FXML
    private TextField txtLandmineWeight;

    @FXML
    private TextField txtLatPullSets;

    @FXML
    private TextField txtLatPullWeight;

    @FXML
    private TextField txtLateralSets;

    @FXML
    private TextField txtLateralWeight;

    @FXML
    private TextField txtLegPressSets;

    @FXML
    private TextField txtLegPressWeight;

    @FXML
    private TextField txtMedicineSets;

    @FXML
    private TextField txtMedicineWeight;

    @FXML
    private TextField txtMilitarySets;

    @FXML
    private TextField txtMilitaryWeight;

    @FXML
    private TextField txtPecDecSets;

    @FXML
    private TextField txtPecDecWeight;

    @FXML
    private TextField txtPistolSets;

    @FXML
    private TextField txtPistolWeight;

    @FXML
    private TextField txtPlankSec;

    @FXML
    private TextField txtPlateSets;

    @FXML
    private TextField txtPlateWeight;

    @FXML
    private TextField txtPressSets;

    @FXML
    private TextField txtPressWeight;

    @FXML
    private TextField txtPushSets;

    @FXML
    private TextField txtPushWeight;

    @FXML
    private TextField txtPushdownSets;

    @FXML
    private TextField txtPushdownWeight;

    @FXML
    private TextField txtReverseSex;

    @FXML
    private TextField txtSeatedSets;

    @FXML
    private TextField txtSeatedWeight;

    @FXML
    private TextField txtShoulderSets;

    @FXML
    private TextField txtShoulderWeight;

    @FXML
    private TextField txtSideSec;

    @FXML
    private TextField txtSitSec;

    @FXML
    private TextField txtTricepWeight;

    @FXML
    private TextField txtWeight;

    @FXML
    private TextField txtWeightSec;

    @FXML
    private TextField txtWeightedWeight;

    @FXML
    private TextField txttricepSets;


    @FXML
    private Label weightLabel;

    @FXML
    private Button weightedBtn;

    @FXML
    private CheckBox cbMilestoneOne;

    @FXML
    private CheckBox cbMilestoneTwo;

    @FXML
    private CheckBox cbMilestoneThree;

    @FXML
    private CheckBox cbMilestoneFour;

    @FXML
    private CheckBox cbMilestoneFive;

    @FXML
    private TableView<Workout> workoutsTable;

    @FXML
    private TableColumn<Workout, String> exerciseCol;

    @FXML
    private TableColumn<Workout, Integer> setsCol;

    @FXML
    private TableColumn<Workout, Double> weightCol;

    @FXML
    private TableColumn<Workout, Double> totalCol;

    @FXML
    private TableColumn<Workout, String> intensityCol;

    String exercise, intensity;
    int set, number=0;
    double kg = 0, total = 0, grandTotal = 0;

    ObservableList<Workout> data = FXCollections.observableArrayList(
    );

    private ImageView addGraphic(String imageFile){
        ImageView imageView = null;
        Image image = new Image(getClass().getResourceAsStream(imageFile));
        imageView = new ImageView(image);
        imageView.setFitWidth(25);
        imageView.setFitHeight(25);
        return imageView;
    }


    @FXML
    private void initialize(){


        mainTabPane.setStyle("-fx-tab-min-width: 51px; -fx-tab-max-width: 51px; -fx-tab-min-height: 30px; -fx-tab-max-height: 30px;");

        profileTab.setGraphic(addGraphic("logos/profile.png"));
        profileTab.setStyle(" -fx-background-color:#ff9621;");
        exercisesTab.setGraphic(addGraphic("logos/exercises.png"));
        exercisesTab.setStyle(" -fx-background-color:#ff9621;");
        blankTab.setStyle(" -fx-background-color:#ff9621; -fx-font-size: 14px; -fx-font-family: 'BebasNeueBold'; -fx-opacity: 100;");
        blankTab.setDisable(true);
        recordsTab.setGraphic(addGraphic("logos/records.png"));
        recordsTab.setStyle(" -fx-background-color:#ff9621;");
        coachTab.setGraphic(addGraphic("logos/bot.png"));
        coachTab.setStyle(" -fx-background-color:#ff9621;");

        chestTab.setStyle(" -fx-background-color:#ff9621; -fx-font-size: 14px; -fx-font-family: 'BebasNeueBold';");

        backTab.setStyle(" -fx-background-color:#ff9621; -fx-font-size: 14px; -fx-font-family: 'BebasNeueBold';");
        armsTab.setStyle(" -fx-background-color:#ff9621; -fx-font-size: 14px; -fx-font-family: 'BebasNeueBold';");
        shouldersTab.setStyle(" -fx-background-color:#ff9621; -fx-font-size: 14px; -fx-font-family: 'BebasNeueBold';");
        legsTab.setStyle(" -fx-background-color:#ff9621; -fx-font-size: 14px; -fx-font-family: 'BebasNeueBold';");
        coreTab.setStyle(" -fx-background-color:#ff9621; -fx-font-size: 14px; -fx-font-family: 'BebasNeueBold';");

        exerciseCol.setStyle(" -fx-background-color:#ff9621; -fx-font-size: 14px; -fx-font-family: 'BebasNeueBold';");
        exerciseCol.setCellValueFactory(new PropertyValueFactory<>("exercise"));

        setsCol.setStyle(" -fx-background-color:#ff9621; -fx-font-size: 14px; -fx-font-family: 'BebasNeueBold';");
        setsCol.setCellValueFactory(new PropertyValueFactory<>("sets"));

        weightCol.setStyle(" -fx-background-color:#ff9621; -fx-font-size: 14px; -fx-font-family: 'BebasNeueBold';");
        weightCol.setCellValueFactory(new PropertyValueFactory<>("weight"));

        totalCol.setStyle(" -fx-background-color:#ff9621; -fx-font-size: 14px; -fx-font-family: 'BebasNeueBold';");;
        totalCol.setCellValueFactory(new PropertyValueFactory<>("total"));

        intensityCol.setStyle(" -fx-background-color:#ff9621; -fx-font-size: 14px; -fx-font-family: 'BebasNeueBold';");
        intensityCol.setCellValueFactory(new PropertyValueFactory<>("intensity"));

        ObservableList<String> choices = FXCollections.observableArrayList("Advice", "Workout Plan", "Diet Plan");
        cmbAskfor.getItems().addAll(choices);

        cbMilestoneOne.setOpacity(100);
        cbMilestoneOne.setDisable(true);
        cbMilestoneTwo.setOpacity(100);
        cbMilestoneTwo.setDisable(true);
        cbMilestoneThree.setOpacity(100);
        cbMilestoneThree.setDisable(true);
        cbMilestoneFour.setOpacity(100);
        cbMilestoneFour.setDisable(true);
        cbMilestoneFive.setOpacity(100);
        cbMilestoneFive.setDisable(true);


    }

    @FXML
    void onDelete(ActionEvent event) {
        Workout selectedItem = workoutsTable.getSelectionModel().getSelectedItem();
        workoutsTable.getItems().remove(selectedItem);

    }

    @FXML
    void onRefresh(ActionEvent event) {
        workoutsTable.refresh();
        Workout workout = new Compute(exercise, set, kg, total, grandTotal, intensity);
        grandTotalLabel.setText("TOTAL WEIGHT LIFTED:\n"+ workout.getGrandTotal());

        if(number > 0){
            cbMilestoneOne.setDisable(false);
            cbMilestoneOne.setSelected(true);
            cbMilestoneOne.setDisable(true);
        }
        if(number >= 5){
            cbMilestoneTwo.setDisable(false);
            cbMilestoneTwo.setSelected(true);
            cbMilestoneTwo.setDisable(true);
        }
        if(number >= 20){
            cbMilestoneFive.setDisable(false);
            cbMilestoneFive.setSelected(true);
            cbMilestoneFive.setDisable(true);
        }
        if(grandTotal > 100){
            cbMilestoneThree.setDisable(false);
            cbMilestoneThree.setSelected(true);
            cbMilestoneThree.setDisable(true);
        }
    }

    @FXML
    void onSetDetails(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("setDetails.fxml"));

            DialogPane setDetails = loader.load();

            DetailsController controller = loader.getController();
            controller.setMainMenuController(this);

            Dialog<ButtonType> dialog = new Dialog<>();
            dialog.setDialogPane(setDetails);
            dialog.setTitle("Set Details");

            dialog.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateProfileLabels(String name, int age, int height, double weight) {
        nameLabel.setText("HELLO! "+name);
        ageLabel.setText(String.valueOf(age));
        heightLabel.setText(height +" cm");
        weightLabel.setText(weight + " kg");

        setDetailsBtn.setText("");
        setDetailsBtn.setDisable(true);
    }




    @FXML
    void onBenchPress(ActionEvent event) {
        exercise = "Bench Press";
        kg = Double.parseDouble(txtBenchWeight.getText());
        set = Integer.parseInt(txtBenchSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);
        workoutsTable.setItems(data);
        number++;

        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }

    }

    @FXML
    void onBicepCurl(ActionEvent event) {
        exercise = "Bicep Curl";
        kg = Double.parseDouble(txtBicepWeight.getText());
        set = Integer.parseInt(txtBicepSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }



    }

    @FXML
    void onCableCross(ActionEvent event) {
        exercise = "Cable Crossover";
        kg = Double.parseDouble(txtCrossWeight.getText());
        set = Integer.parseInt(txtCrossSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);

        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }



    }

    @FXML
    void onCableFly(ActionEvent event) {
        exercise = "Cable Fly";
        kg = Double.parseDouble(txtFlyWeight.getText());
        set = Integer.parseInt(txtFlySets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }



    }

    @FXML
    void onCableRow(ActionEvent event) {
        exercise = "Cable Row";
        kg = Double.parseDouble(txtCableRowWeight.getText());
        set = Integer.parseInt(txtCableRowSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }



    }

    @FXML
    void onChestDip(ActionEvent event) {
        exercise = "Chest Dip";
        kg = Double.parseDouble(txtDipWeight.getText());
        set = Integer.parseInt(txtDipSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }




    }

    @FXML
    void onDeadlift(ActionEvent event) {
        exercise = "Deadlifts";
        kg = Double.parseDouble(txtDeadliftWeight.getText());
        set = Integer.parseInt(txtDeadliftSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }



    }

    @FXML
    void onDecline(ActionEvent event) {
        exercise = "Decline Sit Ups";
        set = Integer.parseInt(txtDecilneSecs.getText());
        kg = 0;

        Compute compute = new Compute();

        total = set;
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }


    }


    @FXML
    void onDumbbellRow(ActionEvent event) {
        exercise = "Dumbbell Row";
        kg = Double.parseDouble(txtDumbbellWeight.getText());
        set = Integer.parseInt(txtDumbbellSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }



    }

    @FXML
    void onExtension(ActionEvent event) {
        exercise = "Leg Extension";
        kg = Double.parseDouble(txtExtensionWeight.getText());
        set = Integer.parseInt(txtExtensionsets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }


    }

    @FXML
    void onHanging(ActionEvent event) {
        exercise = "Hanging Sit Up";
        set = Integer.parseInt(txtHangingSec.getText());
        kg = 0;

        Compute compute = new Compute();

        total = set;
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }



    }

    @FXML
    void onHip(ActionEvent event) {
        exercise = "Hip Thrust";
        kg = Double.parseDouble(txtHipWeight.getText());
        set = Integer.parseInt(txtHipSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }


    }

    @FXML
    void onKickBack(ActionEvent event) {
        exercise = "Tricep Kickback";
        kg = Double.parseDouble(txtKickbackWeight.getText());
        set = Integer.parseInt(txtKickbackSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);
        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }


    }

    @FXML
    void onLandmine(ActionEvent event) {
        exercise = "Landmine Press";
        kg = Double.parseDouble(txtLandmineWeight.getText());
        set = Integer.parseInt(txtLandmineSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }


    }

    @FXML
    void onLatPulldown(ActionEvent event) {
        exercise = "Lat Pulldown";
        kg = Double.parseDouble(txtLatPullWeight.getText());
        set = Integer.parseInt(txtLatPullSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }


    }

    @FXML
    void onLateralRasei(ActionEvent event) {
        exercise = "Lateral Raise";
        kg = Double.parseDouble(txtLateralWeight.getText());
        set = Integer.parseInt(txtLateralSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }


    }

    @FXML
    void onLegPress(ActionEvent event) {
        exercise = "Leg Press";
        kg = Double.parseDouble(txtLegPressWeight.getText());
        set = Integer.parseInt(txtLegPressSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);
        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }


    }

    @FXML
    void onMilitary(ActionEvent event) {
        exercise = "Military Press";
        kg = Double.parseDouble(txtMilitaryWeight.getText());
        set = Integer.parseInt(txtMilitarySets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }


    }

    @FXML
    void onMedicine(ActionEvent event) {
        exercise = "Medicine Ball Squats";
        kg = Double.parseDouble(txtMedicineWeight.getText());
        set = Integer.parseInt(txtMedicineSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }



    }

    @FXML
    void onPistol(ActionEvent event) {
        exercise = "Pistol Squat";
        kg = Double.parseDouble(txtPistolWeight.getText());
        set = Integer.parseInt(txtPistolSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }



    }

    @FXML
    void onPlank(ActionEvent event) {
        exercise = "Plank";
        set = Integer.parseInt(txtPlankSec.getText());
        kg = 0;

        Compute compute = new Compute();

        total = set;
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }



    }

    @FXML
    void onPlate(ActionEvent event) {
        exercise = "Plate Rotations";
        kg = Double.parseDouble(txtPlateWeight.getText());
        set = Integer.parseInt(txtPlateSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }



    }

    @FXML
    void onPullUp(ActionEvent event) {
        exercise = "Pull Ups";
        kg = Double.parseDouble(txtPullWeight.getText());
        set = Integer.parseInt(txtPullSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }

    }

    @FXML
    void onPushUp(ActionEvent event) {
        exercise = "Push Ups";
        kg = Double.parseDouble(txtPushWeight.getText());
        set = Integer.parseInt(txtPushSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);
        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }

    }


    @FXML
    void onReverse(ActionEvent event) {
        exercise = "Reverse Plank";;
        set = Integer.parseInt(txtReverseSex.getText());
        kg = 0;

        Compute compute = new Compute();

        total = set;
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }

    }

    @FXML
    void onSeatedRow(ActionEvent event) {
        exercise = "Seated Row";
        kg = Double.parseDouble(txtSeatedWeight.getText());
        set = Integer.parseInt(txtSeatedSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }

    }

    @FXML
    void onShoulderPress(ActionEvent event) {
        exercise = "Shoulder Press";
        kg = Double.parseDouble(txtShoulderWeight.getText());
        set = Integer.parseInt(txtShoulderSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }
    }

    @FXML
    void onSide(ActionEvent event) {
        exercise = "Side Plank";
        set = Integer.parseInt(txtSideSec.getText());
        kg = 0;

        Compute compute = new Compute();

        total = set;
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }
    }

    @FXML
    void onSitUp(ActionEvent event) {
        exercise = "Sit Ups";
        set = Integer.parseInt(txtSitSec.getText());
        kg = 0;

        Compute compute = new Compute();

        total = set;
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }

    }

    @FXML
    private ComboBox<String> cmbAskfor;


    String message, weight, height, goal, askFor, gender;

    @FXML
    void onSubmit(ActionEvent event) {
        weight = txtWeight.getText();
        height = txtHeight.getText();
        goal = txtGoal.getText();
        askFor = cmbAskfor.getSelectionModel().toString();

        message = "Provide workout plan based on a personal coach perspective." +
                "My goal in fitness is to "+ goal + ". As a "+ gender +
                "with the Height of"+ height +"cm and weight of"+weight+"kg. " +
                "Limit your output in less than 150 words, make it paragraph style.";

        String response = ChatGPT.chatGPT(message);
        int c = 0;
        String textAreaContent = "";

        for(char i : response.toCharArray()){
            c++;
            textAreaContent = textAreaContent + i;
            if(c >= 62){
                if(Character.isWhitespace(i)){
                    textAreaContent = textAreaContent + "\n";
                    c = 0;
                }
            }
        }
        textAreaAI.setText(textAreaContent);

    }


    public void onMale(ActionEvent event) {
        gender = "Male";
        rbFemale.setSelected(false);

    }

    public void onFemale(ActionEvent event) {
        gender = "Female";
        rbMale.setSelected(false);
    }

    @FXML
    void onTricepDips(ActionEvent event) {
        exercise = "Tricep Dips";
        kg = Double.parseDouble(txtTricepWeight.getText());
        set = Integer.parseInt(txttricepSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }

    }

    @FXML
    void onWeighted(ActionEvent event) {
        exercise = "Weighted Sit Ups";
        kg = Double.parseDouble(txtWeightedWeight.getText());
        set = Integer.parseInt(txtWeightSec.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }

    }

    public void onBand(ActionEvent event) {
        exercise = "Band Bicep Curls";
        kg = Double.parseDouble(txtBandWeight.getText());
        set = Integer.parseInt(txtBandSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }
    }

    public void onIncline(ActionEvent event) {
        exercise = "Incline Bench Press";
        kg = Double.parseDouble(txtInclineWeight.getText());
        set = Integer.parseInt(txtInclineSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }

    }

    public void onChestPress(ActionEvent event) {
        exercise = "Chest Press";
        kg = Double.parseDouble(txtPressWeight.getText());
        set = Integer.parseInt(txtPressSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }
    }

    public void onPecDec(ActionEvent event) {
        exercise = "Pec Dec FLy";
        kg = Double.parseDouble(txtPecDecWeight.getText());
        set = Integer.parseInt(txtPecDecSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }


    }

    public void onBarbell(ActionEvent event) {
        exercise = "Barbell Squat";
        kg = Double.parseDouble(txtBarbellWeight.getText());
        set = Integer.parseInt(txtBarbellSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);
        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }

    }

    public void onPushdown(ActionEvent event) {
        exercise = "Tricep Pushdown";
        kg = Double.parseDouble(txtPushdownWeight.getText());
        set = Integer.parseInt(txtPushdownSets.getText());

        Compute compute = new Compute();

        total = compute.getTotal(kg, set);
        intensity = compute.getIntensity(total);
        grandTotal += total;

        Workout setValues = new Compute(exercise, set, kg, total, grandTotal, intensity);

        data.add(setValues);

        workoutsTable.setItems(data);
        number++;
        if(total >= 100){
            cbMilestoneFour.setDisable(false);
            cbMilestoneFour.setSelected(true);
            cbMilestoneFour.setDisable(true);
        }
    }

}
