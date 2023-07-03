package org.practise;

public class Arbusto extends Planta {
    private long ancho;
    private boolean esDomestico;
    private String variedad;
    private String colorHojas;
    private boolean sePodaONo;

    public Arbusto() {
    }

    public Arbusto(String nombre, int alturaTallo, boolean tieneHojas, String climaIdeal, long ancho, boolean esDomestico, String variedad, String colorHojas, boolean sePodaONo) {
        super(nombre, alturaTallo, tieneHojas, climaIdeal);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.variedad = variedad;
        this.colorHojas = colorHojas;
        this.sePodaONo = sePodaONo;
    }

    public long getAncho() {
        return ancho;
    }

    public void setAncho(long ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    @Override
    public void saludoPlanta() {
        System.out.println("Hola, soy un arbusto");
    }
}
