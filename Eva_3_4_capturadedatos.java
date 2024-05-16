/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_4_capturadedatos;

import java.util.Scanner;

/**
 *
 * @author susye
 */
public class Eva_3_4_capturadedatos {

    public static void main(String[] args) {
        int cant;
        Scanner captu = new Scanner(System.in);
        System.out.println("Nombres a capturar");
        cant = captu.nextInt();
            String[] ListaNombre = new String[cant];
        captu.nextLine();
        for(int i = 0; i < ListaNombre.length; i++){
            System.out.println("nombre #" +(i + 1)+ ":");
            ListaNombre[i] = captu.nextLine();
            
        }
            for(int i = 0; i < ListaNombre.length; i++){
                System.out.println(ListaNombre[i]);
            }
            
                
                
                
               
    }
}
