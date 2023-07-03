package org.practise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una ArrayList de tipo videoJuego.
        List<VideoJuego> listaJuegos = new ArrayList<>();

        //Crear 5 videojuegos y guardarlos en la collection
        VideoJuego juego1 = new VideoJuego(1, "GTA", "Play Station", 2);
        VideoJuego juego2 = new VideoJuego(2, "FIFA", "Xbox", 6);
        VideoJuego juego3 = new VideoJuego(3, "PES", "Play Station", 4);
        VideoJuego juego4 = new VideoJuego(4, "COD", "Xbox", 1);
        VideoJuego juego5 = new VideoJuego(5, "Minecraft", "Nintendo 64", 1);

        // agregamos los videjuegos a la lista creada
        listaJuegos.add(juego1);
        listaJuegos.add(juego2);
        listaJuegos.add(juego3);
        listaJuegos.add(juego4);
        listaJuegos.add(juego5);

        //Recorrer la ArrayList creada y mostrar por pantalla el tìtulo, consola y cantidad de jugadopres de los videjuegos almacenados

        for (VideoJuego juego : listaJuegos) {
            System.out.println("Titulo: " + juego.getTitulo() + ", consola: " + juego.getCategoria() + ", cantidad de jugadores: " + juego.getCantidadJugadores());
        }

        System.out.println("---------------------------------------------------");
        //Cambiar el nombre y la cantidad de jugadores de 2 videojuegos y mostrarlos por pantalla.
        juego1.setTitulo("GTA V");
        juego1.setCantidadJugadores(4);

        juego2.setTitulo("FIFA 2021");
        juego2.setCantidadJugadores(2);

        System.out.println("Titulo nuevo de juego1 : " + juego1.getTitulo() + " se juega de a " + juego1.getCantidadJugadores());

        System.out.println("Titulo nuevo : juego2: " + juego2.getTitulo() + " se juega de a " + juego2.getCantidadJugadores());


        System.out.println("---------------------------------------------------");
        //Recorrer la ArrayList y mostrar por pantalla únicamente a los videjuegos que sean de la consola "Nintendo 64"
        for (VideoJuego juego : listaJuegos) {
            if (juego.getCategoria().equals("Nintendo 64")) {
                System.out.println("Titulo: " + juego.getTitulo() + " se juega con Nintendo 64");
            }
        }


    }
}