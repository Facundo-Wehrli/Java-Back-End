package org.practise;

//Crear clase planta con atributos
public abstract class Planta {
    private String nombre;
    private int alturaTallo;
    private boolean tieneHojas;
    private String climaIdeal;

    // constructores, getters y setters.


    public Planta() {
    }

    public Planta(String nombre, int alturaTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.alturaTallo = alturaTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAlturaTallo() {
        return alturaTallo;
    }

    public void setAlturaTallo(int alturaTallo) {
        this.alturaTallo = alturaTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    public abstract void saludoPlanta();
}
