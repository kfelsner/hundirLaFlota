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
    private int[][] posicionesOcupadas;
    private boolean[][] posicionesHeridas;

    //--------Metodos--------//
    
    // ==== WORK IN PROGRESS ==== //
    
    //Constructor
    public Barco (barcos tipo) {
        if (tipo.equals("portaaviones")) {
            medida = 5;
            posicionesOcupadas = new int[medida][2];
        }
        if (tipo.equals("buque")) {
            medida = 3;
            posicionesOcupadas = new int[medida][2];
        }
        if (tipo.equals("lancha")) {
            medida = 2;
            posicionesOcupadas = new int[medida][2];
        }
    }
    
    //Colocar barco en el tablero.
    public void colocarBarcos(){
        
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        
        for (int k = 0; k < 1; k++) {
            if (!Tablero.tabla[x][y].contenido) {
                Tablero.tabla[x][y].forma = '*';
                Tablero.tabla[x][y].contenido = true;
            }
        }
    }
    
    public void hundido() {
        hundido = true;
    }
    
    public void herido(int x, int y){
        posicionesHeridas[x][y] = true;
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
