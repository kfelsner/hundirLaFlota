package hundirlaflota;

/**
 *
 * @author kfelsner
 */
public class Tablero {

    //--------Declaraciones--------//
    public static Casillas[][] tabla = new Casillas[10][10];
    Barco[] nBarcos = new Barco[0];

    //--------Metodos--------//
    // ==== WORK IN PROGRESS ==== //
    /*----Crear tabla----*/
    public void crearTablero() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                tabla[x][y] = new Casillas();
            }
        }
    }

    public void mostrarTablero() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.print(tabla[x][y].forma + " ");
            }
            System.out.println();
        }
    }
}
