/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_19_referencias;

/**
 *
 * @author susye
 */
public class Eva_3_19_referencias {

    public static void main(String[] args) {
        int[] arreglo = new int [5];
        int x = 100;
        System.out.println("antes de llamar al metodo. x=" + x);
        sumarUno(x);
        System.out.println("Despues de llamar al metodo.x :" + x);
        System.out.println("=========================");
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("[" + arreglo[i] + "]");
            
        }
    }
    public static void sumarUno(int valor){
        System.out.println("antes de la operacion:" + valor);
        valor = valor + 1;
        System.out.println("Despues de la operacion:" + valor);
        
    }
    public static void ModificarArreglo(int [] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            arreglo [i] = (int)(Math.random()*100);
        }
            
    }
}
