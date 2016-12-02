package hundirlaflota;

/**
 *
 * @author kfelsner
 */
public class Tablero {

    //--------Declaraciones--------//
    private int [][] medidas = new int [10][10];
    Barco [] nBarcos = new Barco [0];
    
    //--------Metodos--------//
    
    /*----Crear tabla----*/
    public void MakeTable(){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                
                medidas[i][j]=0;
            }
        }
    }
    
    public void ShowTable(){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(medidas[i][j] + " ");
            }
        System.out.println();
        }
    }
    
    /*----Generacion de Barcos----*/
    public void ShipGeneration(){
        
    }
    
}
