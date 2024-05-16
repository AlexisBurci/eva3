/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_17_bisisesto;

import java.util.Scanner;

/**
 *
 * @author susye
 */
public class Eva_3_17_bisisesto {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("ano a evaluar");
        int year = captu.nextInt();
        boolean resu = esBisiesto(year);
        if(resu == true)
            System.out.println("Es bisiesto");
        else 
            System.out.println("no es bisiesto");
    }
    public static boolean esBisiesto(int year){
        int ano1 = year % 4;
        int ano2 = year % 100;
        int ano3 = year % 400;
        if((ano1 == 0) && ((ano2 != 0))|| (ano3 == 0))
            return true;
        else
            return false;
    }
}
