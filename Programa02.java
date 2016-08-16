/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa02;
import java.util.Random;

/**
 *
 * @author Vicente
 */
public class Programa02 {
    private int matriz[][];
    private Random random;
    public Programa02(){
        this.matriz= new int[3][3];
        random = new Random();
    }
    
    public static void main(String[] args) {
       Programa02 m = new Programa02();
       m.completarmatriz();
       m.mostrar();
       m.cajamagic();
       
    }
    public void completarmatriz(){
        int i,j,n;
            for (i=0;i<matriz.length;i++){
                for(j=0;j<matriz.length;j++){
                    matriz[i][j]=genrandom();
                    }
                }
            }
    public void cajamagic(){
        if (matriz[0][0] + matriz[0][1]+ matriz [0][2] == 15 && matriz[0][0]+ matriz[2][1]+ matriz[2][2]==15 && matriz[0][0] + matriz[1][0]+ matriz [2][0]==15 && matriz[0][2]+ matriz[1][2]+ matriz[2][2]==15 && matriz[0][2]+ matriz[2][1]+ matriz[2][0]==15 && matriz[2][0]+ matriz[2][1]+ matriz[2][2]==15 && matriz[1][0]+ matriz[1][1]+ matriz [1][2]== 15 && matriz[0][1] + matriz[1][1]+matriz [2][1]==15){
            System.out.println("Es una caja magica");
        }else{
            System.out.println("No es un caja magica");
        }
    }
    
    
    private int genrandom(){
        int nro = 1 + random.nextInt(9);
        if (Repetido(nro)){
            nro= genrandom();
        } 
        return nro;
    } 
    private boolean Repetido(final int nro){      
        boolean Repetido = false;
        for (int[] i : matriz){
            for(int j : i){
                if (j == nro)
                    Repetido = true;
            }
        } 
        return Repetido;
    }
    public void mostrar(){
        int i,j;
        for(i=0;i<matriz.length;i++){
            for (j=0;j<matriz.length;j++){
            System.out.print(matriz[i][j]);
            
        } 
            System.out.println();
        }
    }
}
