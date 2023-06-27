package org.pokemon;

public class Bulbasaur extends Pokemon implements IPlanta {
    public Bulbasaur() {
    }
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Bulbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Bulbasaur y este es mi ataque placaje");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Bulbasaur y este es mi ataque placaje");

    }

    @Override
    public void atacarPalarizar() {
        System.out.println("Soy Bulbasaur y este es mi ataque paralizar");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy Bulbasaur y este es mi ataque latigo cepa");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy Bulbasaur y este es mi ataque hoja afilada");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasaur y este es mi ataque drenaje");
    }
}
