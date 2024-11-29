package com.gchaldu.javafxcalculators.calculators.controller;

import com.gchaldu.javafxcalculators.calculators.Calculadora;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculadoraController {

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn0;

    @FXML
    private Button btnMas;

    @FXML
    private Button btnMenos;

    @FXML
    private Button btnMul;

    @FXML
    private Button btnDiv;

    @FXML
    private TextField txtres;

    @FXML
    public void initialize() {
        // Validación: Solo permitir números
        txtres.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtres.setText(newValue.replaceAll("[^\\d]", "")); // Reemplaza los caracteres no numéricos
            }
        });
    }

    //PARA SABER CUANDO LIMPIAR txtres
    private boolean otra=false;

    Calculadora calculadora = new Calculadora();

    public CalculadoraController() {
        // Constructor vacío requerido por JavaFX
    }

    @FXML
    protected void onBtnMas() {
        this.operacion="+";
        this.onOperacion();
    }

    @FXML
    protected void onBtnMenos() {
        this.operacion="-";
        this.onOperacion();
    }

    @FXML
    protected void onBtnMultiplicar() {
        this.operacion="*";
        this.onOperacion();
    }

    @FXML
    protected void onBtnDividir() {
        this.operacion="/";
        this.onOperacion();
    }

    @FXML
    protected void onBtnIgual(){
        this.onOperacion();
        this.operacion="";
    }

    private String operacion="";

    protected void onOperacion() {
        try {
            if(this.operacion.equals("+")){
                Double valorActual = Double.parseDouble(txtres.getText());
                this.calculadora.suma(valorActual);
                txtres.setText("");
                this.txtres.setText(String.valueOf(this.calculadora.getResultado()));
                this.otra=true;
            }else if(this.operacion.equals("-")){
                Double valorActual = Double.parseDouble(txtres.getText());
                this.calculadora.resta(valorActual);
                txtres.setText("");
                this.txtres.setText(String.valueOf(this.calculadora.getResultado()));
                this.otra=true;
            }else if(this.operacion.equals("*")){
                Double valorActual = Double.parseDouble(txtres.getText());
                this.calculadora.multiplicar(valorActual);
                txtres.setText("");
                this.txtres.setText(String.valueOf(this.calculadora.getResultado()));
                this.otra=true;
            }else if(this.operacion.equals("/")){
                Double valorActual = Double.parseDouble(txtres.getText());
                this.calculadora.dividir(valorActual);
                txtres.setText("");
                this.txtres.setText(String.valueOf(this.calculadora.getResultado()));
                this.otra=true;
            }
        } catch (NumberFormatException e) {
            // Manejo de error si el texto no es un número válido
            System.err.println("Error: Entrada no válida en el campo de texto. Debe ser un número.");
            txtres.setText("");
        }
    }



    /** Numeros*/
    @FXML
    protected void onBtn1(){

        if(otra==true){
            //limpio
            this.txtres.setText("");
        }
        txtres.setText(txtres.getText() + this.calculadora.getUno());
        otra=false;
    }

    @FXML
    protected void onBtn2(){

        if(otra==true){
            //limpio
            this.txtres.setText("");
        }
        txtres.setText(txtres.getText() + this.calculadora.getDos());
        otra=false;
    }

    @FXML
    protected void onBtn3(){

        if(otra==true){
            //limpio
            this.txtres.setText("");
        }
        txtres.setText(txtres.getText() + this.calculadora.getTres());
        otra=false;
    }

    @FXML
    protected void onBtn4(){

        if(otra==true){
            //limpio
            this.txtres.setText("");
        }
        txtres.setText(txtres.getText() + this.calculadora.getCuatro());
        otra=false;
    }

    @FXML
    protected void onBtn5(){

        if(otra==true){
            //limpio
            this.txtres.setText("");
        }
        txtres.setText(txtres.getText() + this.calculadora.getCinco());
        otra=false;
    }

    @FXML
    protected void onBtn6(){

        if(otra==true){
            //limpio
            this.txtres.setText("");
        }
        txtres.setText(txtres.getText() + this.calculadora.getSeis());
        otra=false;
    }

    @FXML
    protected void onBtn7(){

        if(otra==true){
            //limpio
            this.txtres.setText("");
        }
        txtres.setText(txtres.getText() + this.calculadora.getSiete());
        otra=false;
    }

    @FXML
    protected void onBtn8(){

        if(otra==true){
            //limpio
            this.txtres.setText("");
        }
        txtres.setText(txtres.getText() + this.calculadora.getOcho());
        otra=false;
    }

    @FXML
    protected void onBtn9(){

        if(otra==true){
            //limpio
            this.txtres.setText("");
        }
        txtres.setText(txtres.getText() + this.calculadora.getNueve());
        otra=false;
    }

    @FXML
    protected void onBtn0(){

        if(otra==true){
            //limpio
            this.txtres.setText("");
        }
        txtres.setText(txtres.getText() + this.calculadora.getCero());
        otra=false;
    }



}
