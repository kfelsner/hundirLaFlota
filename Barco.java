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
public class Barco {
    
    //--------Declaraciones--------//
    private int medida;
    private enum barcos {portaaviones, buque, lancha};
    private boolean hundido = false;
    private int [] [] posicionesOcupadas = new int [0][0];
    private boolean [] [] posicionesHeridas;
    
    //--------Metodos--------//
    void MakeShip(Barco.barcos tipo){
        if (tipo.equals("portaaviones")){
            
        }
    }
 }
