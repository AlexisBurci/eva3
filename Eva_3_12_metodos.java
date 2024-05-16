/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_12_metodos;

/**
 *
 * @author susye
 */
public class Eva_3_12_metodos {

    public static void main(String[] args) {
       mostrarMensaje("hola mundno");
       mostrarMuchosMensajes("hola",5);
       
    }
    public static void mostrarMensaje(String Mensaje){
        System.out.println(Mensaje);
        
    }
    public static void mostrarMuchosMensajes(String mensajes, int veces){
        for(int i = 0; i < veces; i++){
        System.out.println(mensajes);
    }
    }
}

