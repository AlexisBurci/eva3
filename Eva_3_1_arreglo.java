/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_1_arreglo;

import java.util.Arrays;

/**
 *
 * @author susye
 */
public class Eva_3_1_arreglo {

    public static void main(String[] args) {
       //los arreglos en java son objetos
       //tenemos que crearlo antes de usarlo
       //[] - manejar los indices
       //declaracion=cracion (new)
       int arreglo [] = new int[10];
       arreglo[1] = 100;
        System.out.println("valor del arreglo[1]=" + arreglo[1]);
        System.out.println(Arrays.toString(arreglo));
        System.out.println(arreglo.length);
              
              
    }
}
