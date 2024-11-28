package com.gchaldu.javafxcalculators.calculators;

public class Calculadora {

    private Double resultado=0.0;

    private Long uno=1l;
    private Long dos=2l;
    private Long tres=3l;
    private Long cuatro=4l;
    private Long cinco=5l;
    private Long seis=6l;
    private Long siete=7l;
    private Long ocho=8l;
    private Long cero=0l;
    private Long nueve=9l;

    public Double suma( Integer numero1){
        return resultado = resultado + numero1;
    }

    public Double resta( Integer numero1){
        return resultado -= numero1;
    }

    public Double dividir( Integer numero1){
        if (numero1 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        if(resultado==0){
            return this.resultado= Double.parseDouble(numero1.toString());
        }
        return resultado /= numero1;
    }

    public Double multiplicar( Integer numero1){
        if(resultado==0){
            return this.resultado= Double.parseDouble(numero1.toString());
        }
        return resultado *= numero1;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public Long getUno() {
        return uno;
    }

    public Long getDos() {
        return dos;
    }

    public Long getTres() {
        return tres;
    }

    public Long getCuatro() {
        return cuatro;
    }

    public Long getCinco() {
        return cinco;
    }

    public Long getSeis() {
        return seis;
    }

    public Long getSiete() {
        return siete;
    }

    public Long getOcho() {
        return ocho;
    }

    public Long getCero() {
        return cero;
    }

    public Long getNueve() {
        return nueve;
    }

}
