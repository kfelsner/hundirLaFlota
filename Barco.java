package hundirlaflota;

/**
 *
 * @author kfelsner
 */
public class Barco {

    //--------Declaraciones--------//
    private int medida;

    enum barcos {
        portaaviones, buque, lancha
    };
    private boolean hundido = false;
    private int[][] posicionesOcupadas;
    private boolean[][] posicionesHeridas;
    private int direccion;

    //--------Metodos--------//
    // ==== WORK IN PROGRESS ==== //
    //Constructor
    public Barco(barcos tipo) {
        switch (tipo) {
            case portaaviones:
                medida = 5;
                posicionesOcupadas = new int[medida][2];
                break;
            case buque:
                medida = 3;
                posicionesOcupadas = new int[medida][2];
            case lancha:
                medida = 1;
                posicionesOcupadas = new int[medida][2];
        }
    }

    

    //Cambia el booleano hundido a true.
    public void hundido() {
        hundido = true;
    }

    //Hiere una posición del barco.
    public void herido(int x, int y) {
        posicionesHeridas[x][y] = true;
    }

    //Metodo que elige la dirección: horizontal o vertical, del barco.
    public void direccion() {
        direccion = (int) (Math.random() % 2);
    }

}

//    public void ponerBarco(Barco.barcos tipo, int x, int y, String orientacion) {
//        if (tipo.equals(barcos.portaaviones)) {
//            medida = 5;
//            posicionesOcupadas[x][y] = 1;
//            for (int i = 1; i < medida; i++) {
//                switch (orientacion) {
//                    case "derecha":
//                        posicionesOcupadas[x + i][y] = 1;
//                        break;
//                    case "izquierda":
//                        posicionesOcupadas[x - i][y] = 1;
//                        break;
//                    case "arriba":
//                        posicionesOcupadas[x][y - i] = 1;
//                        break;
//                    case "abajo":
//                        posicionesOcupadas[x][y + i] = 1;
//                        break;
//                }
//            }
//        } else if (tipo.equals(barcos.buque)) {
//            medida = 3;
//            posicionesOcupadas[x][y] = 1;
//            for (int i = 1; i < medida; i++) {
//                switch (orientacion) {
//                    case "derecha":
//                        posicionesOcupadas[x + i][y] = 1;
//                        break;
//                    case "izquierda":
//                        posicionesOcupadas[x - i][y] = 1;
//                        break;
//                    case "arriba":
//                        posicionesOcupadas[x][y - i] = 1;
//                        break;
//                    case "abajo":
//                        posicionesOcupadas[x][y + i] = 1;
//                        break;
//                }
//            }
//        } else if (tipo.equals(barcos.lancha)) {
//            medida = 1;
//            posicionesOcupadas[x][y] = 1;
//        } else {
//            System.out.println("Bad input.");
//        }
//    }
//
//    /*----Posiciones Heridas----*/
//    public void posicionHerida(int fila, int columna ) {
//        
//    }
//}
