/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_10_foreach;

/**
 *
 * @author susye
 */
public class Eva_3_10_foreach {

    public static void main(String[] args) {
        String diasSemana[] = {"domingo", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};
        for(String dia : diasSemana){
            System.out.println(dia);
        }
        int salario[] = {15, 100, 120, 150, 1232, 2414, 14325};
        for(int cant : salario)
            System.out.println("$" + cant);
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        for(String ano : meses)
            System.out.println(ano);
            
        
    }
}
