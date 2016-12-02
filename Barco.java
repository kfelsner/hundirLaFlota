package hundirlaflota;

/**
 *
 * @author kfelsner
 */
public class Barco {

    //--------Declaraciones--------//
    private int medida;
    enum barcos {portaaviones, buque, lancha};
    private boolean hundido = false;
    private int[][] posicionesOcupadas = new int[medida][2];
    private boolean[] posicionesHeridas = new boolean[medida];

    //--------Metodos--------//
    /*----Barcos----*/
    
    public void PutShip(Barco.barcos tipo, int x, int y, String orientacion) {
        if (tipo.equals(barcos.portaaviones)) {
            medida = 5;
            posicionesOcupadas[x][y] = 1;
            for (int i = 1; i < medida; i++) {
                switch (orientacion) {
                    case "derecha":
                        posicionesOcupadas[x + i][y] = 1;
                        break;
                    case "izquierda":
                        posicionesOcupadas[x - i][y] = 1;
                        break;
                    case "arriba":
                        posicionesOcupadas[x][y - i] = 1;
                        break;
                    case "abajo":
                        posicionesOcupadas[x][y + i] = 1;
                        break;
                }
            }
        } else if (tipo.equals(barcos.buque)) {
            medida = 3;
            posicionesOcupadas[x][y] = 1;
            for (int i = 1; i < medida; i++) {
                switch (orientacion) {
                    case "derecha":
                        posicionesOcupadas[x + i][y] = 1;
                        break;
                    case "izquierda":
                        posicionesOcupadas[x - i][y] = 1;
                        break;
                    case "arriba":
                        posicionesOcupadas[x][y - i] = 1;
                        break;
                    case "abajo":
                        posicionesOcupadas[x][y + i] = 1;
                        break;
                }
            }
        } else if (tipo.equals(barcos.lancha)) {
            medida = 1;
            posicionesOcupadas[x][y] = 1;
        } else {
            System.out.println("Bad input.");
        }
    }

    /*----Posiciones Heridas----*/
    public void HurtPosition(int fila, int columna ) {
        = true;
    }
}
