package GrupoMusical;

public class Banda extends Genero{
    private String nombreBanda;
    private int anioFundacion;

    public Banda(String genero, String nombreBanda, int anioFundacion) {
        super(genero);
        this.nombreBanda = nombreBanda;
        this.anioFundacion = anioFundacion;
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public int getAnioFundacion() {
        return anioFundacion;
    }
}
