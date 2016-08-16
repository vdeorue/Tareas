/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dci
 */
public class Matriz {
    private int matriz[][];
    Random random;
    private int a;
    
    private Matriz(){
        this.matriz= new int[12][32];
                random= new Random();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A,B,C,D,N;
        Matriz matriz= new Matriz();
      System.out.println("Eliga Opcion1,Opcion2,Opcion3,Opcion4.");
      System.out.println();
      System.out.println("(escriba numero de la opcion )");
      N= DarNumero();
      
          }
     public static void Menu(){
         int N;
         if
         
         
                
                 
                 }
    public void completarmatriz(){
        int i,j;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz.length;j++){
                matriz[i][j]=1+random.nextInt(50);
            }
        }
    }
 
     public static int DarNumero(){
        int N;
        Scanner Dar=new Scanner(System.in);
        N=Dar.nextInt();
        return N; 
 
     } 
     public void Opcion1(){
        int i,j,suma=0;
        for(i=1;i<matriz.length;i++){
            for(j=1;j<matriz.length;j++){
                suma += matriz[i][j];
            }
        }
     } 
     public void Opcion01(){
         int i,j,N=0;
         for(i=1;i<matriz.length;i++){
             for(j=1;j<matriz.length;j++){
                 N=matriz[i][j];
                 if (N<=5){
                     matriz[i][j]= N*100;
                 }else if (N>5 && N< 12){
                     matriz[i][j]=N*100 + 2000;
                 }else{
                     matriz[i][j]=N*120+ N*120/10;         
                 }
             }
         }
     } 
     public void Opcion02(){
         int i,j,N=0;
         
         
     }
}

