/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_9_arreglos;

/**
 *
 * @author susye
 */
public class Eva_3_9_arreglos {

    public static void main(String[] args) {
        String diasSemana[] = {"domuingo", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        System.out.println("Tamano del arreglo dia semana" + diasSemana.length);
        System.out.println("Arreglo de vocales" + vocales.length);
        for(int i = 0; i < diasSemana.length; i++){
            System.out.println(diasSemana[i]);
            
        }
        for(int i = 0; i < vocales.length; i++){
            System.out.println(vocales[i]);
        }
    }
}
