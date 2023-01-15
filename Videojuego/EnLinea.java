package Videojuego;

public class EnLinea extends Videojuego{
    private int cantidadUsuarios;
    private String plataforma;

    public EnLinea(String nombre, int anio, int cantidadUsuarios, String plataforma) {
        super(nombre, anio);
        this.cantidadUsuarios = cantidadUsuarios;
        this.plataforma = plataforma;
    }

    public int getCantidadUsuarios() {
        return cantidadUsuarios;
    }

    public String getPlataforma() {
        return plataforma;
    }
}
