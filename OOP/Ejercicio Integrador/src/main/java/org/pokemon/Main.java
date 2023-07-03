package org.pokemon;

public class Main {
    public static void main(String[] args) {
    Charmander charmandersito = new Charmander();
    Bulbasaur bulbasaurcito = new Bulbasaur();
    Pikachu pikachucito = new Pikachu();
    Squirtle squirtlecito = new Squirtle();

    charmandersito.atacarAraniazo();
    charmandersito.atacarLanzallamas();

    bulbasaurcito.atacarAraniazo();
    bulbasaurcito.atacarHojaAfilada();

    pikachucito.atacarAraniazo();
    pikachucito.atacarRayo();

    squirtlecito.atacarAraniazo();
    squirtlecito.atacarBurbuja();
    }
}