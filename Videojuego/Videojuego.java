package Videojuego;

public class Videojuego {
    private String nombre;
    private int anio;

    public Videojuego(String nombre, int anio) {
        this.nombre = nombre;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnio() {
        return anio;
    }
}
