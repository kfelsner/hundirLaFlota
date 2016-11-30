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
public class Tablero {

    //--------Declaraciones--------//
    private int [][] medidas = new int [10][10];
    private int [] barcos;
    
    //--------Metodos--------//
    void Show(){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                medidas[i][j]=0;

                System.out.print( (medidas [i] [j]) + " " );
            }
        System.out.println();
        }
    }
}
