package Comida;

public class Plato extends Region{
    private String nombrePlato;

    public Plato(String continente, String nombrePais, String nombreRegion, int cantidadHabitantes, String nombrePlato) {
        super(continente, nombrePais, nombreRegion, cantidadHabitantes);
        this.nombrePlato = nombrePlato;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    @Override
    public String toString(){
        return "En el continente " + getContinente() + ", exactamente en " + getNombrePais() + ", en la region "
                + getNombreRegion() + ", donde residen " + getCantidadHabitantes() + " habitantes, se tiene el plato tipico llamado: "
                + nombrePlato + ".\n";
    }
}
