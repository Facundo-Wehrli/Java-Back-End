package org.pokemon;

public class Squirtle extends Pokemon implements IAgua{
    public Squirtle() {
    }
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Squirtle y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Squirtle y este es mi ataque mordizco");
    }

    @Override
    public void atacarHidroBomb() {
        System.out.println("Soy Squirtle y este es mi ataque hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y este es mi ataque pistola de agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y este es mi ataque burbuja");
    }

    @Override
    public void atacarHidroPulso() {
        System.out.println("Soy Squirtle y este es mi ataque hidropulso");
    }
}
