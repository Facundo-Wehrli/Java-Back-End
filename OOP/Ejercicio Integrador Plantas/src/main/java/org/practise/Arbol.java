package org.practise;

public class Arbol extends Planta {
    private String variedad;
    private String tipoTronco;
    private double radioTronco;
    private String color;
    private String tipoHoja;

    public Arbol() {
    }

    public Arbol(String nombre, int alturaTallo, boolean tieneHojas, String climaIdeal, String variedad, String tipoTronco, double radioTronco, String color, String tipoHoja) {
        super(nombre, alturaTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radioTronco = radioTronco;
        this.color = color;
        this.tipoHoja = tipoHoja;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public double getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(double radioTronco) {
        this.radioTronco = radioTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoHoja() {
        return tipoHoja;
    }

    public void setTipoHoja(String tipoHoja) {
        this.tipoHoja = tipoHoja;
    }

    @Override
    public void saludoPlanta() {
        System.out.println("Hola, soy un árbol");
    }

}
