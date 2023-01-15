import Videojuego.*;
import Comida.*;
import GrupoMusical.*;

public class Main {
    public static void main(String[] args) {
        try {
            Videojuego[] juego = new Aventura[3];
            juego[0] = new Aventura("Fortnite",2017,15000000, "PC", 2380);
            juego[1] = new Aventura("Clash of Clans",2017,6500000, "Movil", 1300);
            juego[2] = new Aventura("Okami",2007,2330000, "PS2", 1333);
            System.out.println("\n\t***** VIDEOJUEGOS *****");
            imprimirListaJuego(juego);
            Pais[] plato = new Plato[3];
            plato[0] = new Plato("America", "Ecuador", "Sierra", 8500000, "Fritada");
            plato[1] = new Plato("America", "Chile", "Zona norte", 3560000, "Ajiaco");
            plato[2] = new Plato("America", "Ecuador", "Costa", 8303000, "Encebollado");
            System.out.println("\n\t***** COMIDAS TIPICAS *****");
            imprimirListaPlatos(plato);
            Genero[] grupo = new Instrumento[3];
            grupo[0] = new Instrumento("Rock","Pxndx",1996, 4, "Guitarra");
            grupo[1] = new Instrumento("Folklore","Kjarkas",1971, 6, "Quena y Zampoña");
            grupo[2] = new Instrumento("Vallenato","Los gigantes del vallenato",1992, 3, "Acordeon");
            System.out.println("\n\t***** GRUPOS MUSICALES *****");
            imprimirListaInstrumentos(grupo);
        } catch (Exception e){
            System.out.println("Ejecucion defectuosa del programa: " + e);
        }
    }
    public static void imprimirListaJuego(Videojuego[] juego){
        for (int i = 0; i < juego.length; i++){
            System.out.print(juego[i]);
        }
    }
    public static void imprimirListaPlatos(Pais[] plato){
        for (int i = 0; i < plato.length; i++){
            System.out.print(plato[i]);
        }
    }
    public static void imprimirListaInstrumentos(Genero[] instrumento){
        for (int i = 0; i < instrumento.length; i++){
            System.out.print(instrumento[i]);
        }
    }
}
