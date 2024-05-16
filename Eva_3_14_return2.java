/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_14_return2;

import java.util.Scanner;

/**
 *
 * @author susye
 */
public class Eva_3_14_return2 {

    public static void main(String[] args) {
        Scanner ver = new Scanner(System.in);
        System.out.println("Entero");
        int val1 = ver.nextInt();
        System.out.println("Potencia");
        int val2 = ver.nextInt();
        System.out.println("el resultado es:" + calcularPot(val1, val2) );
            
                
    }
    public static int calcularPot(int base, int potencia){
        int resu = 1;
        for(int i = 0; i < potencia; i++){
            resu = base;
            
        }
        return resu;
            
    }
}
