/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_16_metodos_y_arreglos;

/**
 *
 * @author susye
 */
public class Eva_3_16_metodos_y_arreglos {

    public static void main(String[] args) {
        int [] datos = new int [10];
        datos = llenar(datos);
        imprimir(datos);
        System.out.println(" ");
        int[]datos2 = new int [15];
        datos2 = llenar(datos2);
        imprimir(datos2);
        
    }
    public static void imprimir(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("[" + arreglo[i] + "]");
            
        }
    }
    public static int [] llenar(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random()*100);
            
        }
        return arreglo;
    }
}
