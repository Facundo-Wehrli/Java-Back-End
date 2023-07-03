package org.practise;

public class VideoJuego {
    private int codigo;
    private String titulo;
    private String categoria;

    private int CantidadJugadores;

    public VideoJuego(int cantidadJugadores) {
        CantidadJugadores = cantidadJugadores;
    }

    public VideoJuego(int codigo, String titulo, String categoria, int cantidadJugadores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.categoria = categoria;
        CantidadJugadores = cantidadJugadores;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", CantidadJugadores=" + CantidadJugadores +
                '}';
    }

    public int getCantidadJugadores() {
        return CantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        CantidadJugadores = cantidadJugadores;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
