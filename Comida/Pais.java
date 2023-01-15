package Comida;

public class Pais {
    private String continente;
    private String nombrePais;

    public Pais(String continente, String nombrePais) {
        this.continente = continente;
        this.nombrePais = nombrePais;
    }

    public String getContinente() {
        return continente;
    }

    public String getNombrePais() {
        return nombrePais;
    }
}
