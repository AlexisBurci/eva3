/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_5_propiedaddereglas;

/**
 *
 * @author susye
 */
public class Eva_3_5_propiedadDeReglas {

    public static void main(String[] args) {
        int arreglo[] = new int[3];
        arreglo[0] = 100;
        arreglo[3] = 200;
        arreglo[4] = 300;
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("[" + arreglo[i] + "]");
            
        }
        arreglo = new int[5];
        System.out.println(" ");
        System.out.println("DESPUES DEL CAMBIO DE TAMANO");
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("[" + arreglo[i] + "]");
        }
            
    }
}
