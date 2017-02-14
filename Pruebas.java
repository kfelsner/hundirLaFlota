/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hundirlaflota;

/**
 *
 * @author kfelsner
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //--------Zona de Pruebas--------//
        Tablero tabla = new Tablero();
        Barco prueba = new Barco(Barco.barcos.buque);
        tabla.crearTablero();
        prueba.colocarBarcos();
        tabla.mostrarTablero();
    }
    
}
