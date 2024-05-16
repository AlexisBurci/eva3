/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_13_return;

import java.util.Scanner;

/**
 *
 * @author susye
 */
public class Eva_3_13_return {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor 1");
        int val1 = captu.nextInt();
        System.out.println("Valor 2");
        int val2 = captu.nextInt();
        System.out.println("La suma = " + sumar(val1,val2));
        
        
    }
    public static int sumar (int num1, int num2){
        int resu = num1 + num2;
        return resu;
    }
}
