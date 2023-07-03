package org.practise;

public class Flor extends Planta {
    private String colorPetalos;
    private double PromedioPetalos;
    private String colorPistilo;

    private String variedad;
    private String estacionDeFloracion;

    public Flor() {
    }

    public Flor(String nombre, int alturaTallo, boolean tieneHojas, String climaIdeal, String colorPetalos, double promedioPetalos, String colorPistilo, String variedad, String estacionDeFloracion) {
        super(nombre, alturaTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        PromedioPetalos = promedioPetalos;
        this.colorPistilo = colorPistilo;
        this.variedad = variedad;
        this.estacionDeFloracion = estacionDeFloracion;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public double getPromedioPetalos() {
        return PromedioPetalos;
    }

    public void setPromedioPetalos(double promedioPetalos) {
        PromedioPetalos = promedioPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getEstacionDeFloracion() {
        return estacionDeFloracion;
    }

    public void setEstacionDeFloracion(String estacionDeFloracion) {
        this.estacionDeFloracion = estacionDeFloracion;
    }

    @Override
    public void saludoPlanta() {
        System.out.println("Hola, soy una flor");
    }
}
