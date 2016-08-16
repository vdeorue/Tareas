/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa01;
import java.util.Scanner;
/**
 *
 * @author Vicente
 */
public class Programa01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int A,B,C,D,N;
    System.out.println("Ingresar cantidad de personas (mismas cantidad de hombres y mujeres) a encuestar.");
    N= DarNumero();
    char enc [][]= new char[2][N];
    System.out.println("Complete la encuesta ");
    CompletarMatriz(enc);
    System.out.println("Fila 1:Hombres, Fila 2: Mujeres");
    VerMatriz(enc);
    A=Hombresaprov(enc);
    System.out.println("Cantidad de aprobacion Hombres ="+ A);
    B=mujeresDesaprov(enc);
    System.out.println("Cantidad de desaprobacion Mujeres="+ B);
    C=aprovTotal(enc);
    System.out.println("Aprobacion Total ="+ C);
    D=Total(enc);
    System.out.println("Total ="+ D);
    
    
    }
     public static int DarNumero(){
        int N;
        Scanner Dar=new Scanner(System.in);
        N=Dar.nextInt();
        return N; 
     }
     public static char Respuesta(){
         String respuesta;
         char a;
         Scanner Dar=new Scanner(System.in);
         respuesta=Dar.next();
         a=respuesta.charAt(0);
         return a;
         
     }
   
     public static void CompletarMatriz (char[][] enc){
         int i,j;
         for (i=0;i<enc.length;i++){
             for (j=0;j<enc[i].length;j++){
                 enc[i][j]= Respuesta();
             }
         }
     } 
     public static int Hombresaprov(char enc[][]){
         int i,j,t=0;
         for(i=0;i<1;i++){
             for(j=0;j<enc[i].length;j++){
                 if(enc[i][j]=='s'){
                     t++;
                 }
             }
         } 
         return t;
        
     } 
     public static int mujeresDesaprov(char enc[][]){
          int i,j,t=0;
         for(i=1;i<enc.length;i++){
             for(j=0;j<enc[i].length;j++){
                 if(enc[i][j]=='n'){
                     t++;
                 }
             }
         } 
         return t;
     } 
      public static int aprovTotal(char enc[][]){
         int i,j,t=0;
         for (i=0;i<enc.length;i++){
             for(j=0;j<enc[i].length;j++){
                 if (enc[i][j]=='s'){
                     t++;
                 }
             }
         } 
         return t;
     } 
     public static int Total(char enc[][]){
         int i,j,t=0;
         for (i=0;i<enc.length;i++){
             for(j=0;j<enc[i].length;j++){
                 if (enc[i][j]== 's' || enc[i][j]=='n' || enc [i][j]== 'x'){
                     t++;
                 }
             }
         } 
         return t;
     }
    
       public static void VerMatriz (char enc[][]){
         int i,j;
         for(i=0;i<enc.length;i++){
             for(j=0;j<enc[i].length;j++){
                 System.out.print(enc[i][j]);
                 }
             System.out.println();
             }
         }
}
