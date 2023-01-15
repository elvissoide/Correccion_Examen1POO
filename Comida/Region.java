package Comida;

public class Region extends Pais{
    private String nombreRegion;
    private int cantidadHabitantes;

    public Region(String continente, String nombrePais, String nombreRegion, int cantidadHabitantes) {
        super(continente, nombrePais);
        this.nombreRegion = nombreRegion;
        this.cantidadHabitantes = cantidadHabitantes;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public int getCantidadHabitantes() {
        return cantidadHabitantes;
    }
}
