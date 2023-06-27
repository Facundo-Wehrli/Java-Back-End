package org.pokemon;

public abstract class Pokemon {
        protected int num_pokedex;
        protected String nombrePokemon;
        protected double pesoPokemon;
        protected String sexo;
        protected String temporadaQueAparece;
        protected String tipo;

        protected abstract void atacarPlacaje();
        protected abstract void atacarAraniazo();
        protected abstract void atacarMordisco();

}
