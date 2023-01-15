package GrupoMusical;

public class Instrumento extends Banda{
    private int cantidadInstrumentos;
    private String instrumentoRepresentativo;

    public Instrumento(String genero, String nombreBanda, int anioFundacion, int cantidadInstrumentos, String instrumentoRepresentativo) {
        super(genero, nombreBanda, anioFundacion);
        this.cantidadInstrumentos = cantidadInstrumentos;
        this.instrumentoRepresentativo = instrumentoRepresentativo;
    }

    public int getCantidadInstrumentos() {
        return cantidadInstrumentos;
    }

    public String getInstrumentoRepresentativo() {
        return instrumentoRepresentativo;
    }

    @Override
    public String toString(){
        return "La banda " + getNombreBanda() + " del genero " + getGenero() + " fundada en el año " + getAnioFundacion() +
                " emplea " + cantidadInstrumentos + "instrumentos, donde el mas representativo es " + instrumentoRepresentativo
                + ".\n";
    }
}
