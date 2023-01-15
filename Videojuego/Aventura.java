package Videojuego;

public class Aventura extends EnLinea{
    private int minutosJugados;

    public Aventura(String nombre, int anio, int cantidadUsuarios, String plataforma, int minutosJugados) {
        super(nombre, anio, cantidadUsuarios, plataforma);
        this.minutosJugados = minutosJugados;
    }

    public int getHorasJugadas() {
        return minutosJugados;
    }
    @Override
    public String toString(){
        return "El videojuego " + getNombre() + " salido en el año " + getAnio() + ", se juega en " + getPlataforma() +
                " con una cantidad de usuarios de " + getCantidadUsuarios() + " millones, en el cual el usuario ha jugado "
                + minutosJugados + " minutos.\n";
    }
}
