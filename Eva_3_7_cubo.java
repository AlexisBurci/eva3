/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_7_cubo;

/**
 *
 * @author susye
 */
public class Eva_3_7_cubo {

    public static void main(String[] args) {
        int cubo[][][] = new int[10][5][3];
        for(int i = 0; i < cubo.length; i++){
            for(int j = 0; j < cubo[i].length; j++){
                for(int k = 0; k < cubo[i][j].length; k++){
                    cubo[i][j][k] = (int)(Math.random() * 100);
                    System.out.println("[" + cubo[i][j][k] + "]");
                }
            }
                    
        }
            
    }
}
