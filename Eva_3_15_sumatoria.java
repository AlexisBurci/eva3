/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_15_sumatoria;

import java.util.Scanner;

/**
 *
 * @author susye
 */
public class Eva_3_15_sumatoria {

    public static void main(String[] args) {
        Scanner ver = new Scanner(System.in);
        System.out.println("Entero");
        int num1 = ver.nextInt();
        int resu = calcularSum(num1);
        System.out.println(resu);
    }
    public static int calcularSum(int base){
        int resu = 0;
        for(int i = 0; i < base; i++){
            resu =+ i;
            
        }
        return resu;
    }
}
