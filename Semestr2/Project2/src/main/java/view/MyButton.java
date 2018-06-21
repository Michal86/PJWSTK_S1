package view;

import javafx.scene.control.Button;

public class MyButton extends Button {

    private final String BTN_NORMAL;
    private final String BTN_HOOVER;
    private final String BTN_PRESSED;
    private final String NAME;
    private boolean      isPressed;

    public MyButton(String name) {
        this.NAME = name;
        BTN_NORMAL = "-fx-background-color: transparent; -fx-background-image: url('/" + name.toLowerCase() + "3.png')";
        BTN_HOOVER = "-fx-background-color: transparent; -fx-background-image: url('/" + name.toLowerCase() + "2.png')";
        BTN_PRESSED = "-fx-background-color: transparent; -fx-background-image: url('/" + name.toLowerCase() + "1.png')";
        setPrefWidth(240);
        setPrefHeight(80);
        setStyle(BTN_NORMAL);
        isPressed = false;
        initButtonListeners();
    }

    //--- ** ---
    public void setButtonPressedStyle() {
        if (!isPressed) {
            setStyle(BTN_PRESSED);
            isPressed = true;
        } else
            setIsPressed();
    }

    public void setButtonHooverStyle() {
        if (!isPressed)
            setStyle(BTN_HOOVER);
    }

    public void setButtonNormalStyle() {
        if (!isPressed)
            setStyle(BTN_NORMAL);
    }

    public void setIsPressed() {
        isPressed = !isPressed;
    }

    public boolean isBtnPressed() {
        return isPressed;
    }

    //---
    public MyButton getbutton() {
        return this;
    }

    public String getNAME() {
        return NAME;
    }

    //--- *TO DO??: MOVE IT TO THE CONTROLLER (just pass the address to controller and make this method there)* ---
    private void initButtonListeners() {
        setOnMouseEntered(event -> setButtonHooverStyle());
        setOnMouseExited(event -> setButtonNormalStyle());
        setOnMousePressed(event -> setButtonPressedStyle());
    }

}
