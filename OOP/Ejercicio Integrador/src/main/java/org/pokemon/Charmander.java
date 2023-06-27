package org.pokemon;

public class Charmander extends Pokemon implements IFuego {
    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy charmander y este es mi ataque arañazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy charmander y este es mi ataque mordizco");

    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy charmander y este es mi ataque puño fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy charmander y este es mi ataque ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy charmander y este es mi ataque lanzallamas");
    }
}
