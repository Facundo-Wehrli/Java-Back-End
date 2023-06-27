package org.pokemon;

public class Pikachu extends Pokemon implements IElectrico{
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Pikachu y este es mi ataque arañazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Pikachu y este es mi ataque mordizco");

    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Pikachu y este es mi ataque impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Pikachu y este es mi ataque puño trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy Pikachu y este es mi ataque rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy Pikachu y este es mi ataque rayo carga");
    }
}
