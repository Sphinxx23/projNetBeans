/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prgpruebagit;

import java.util.*;

public class Ej1 {

    public static boolean tieneNumeros(int[] arra, int aNu, int nVez) {
        int auxList;
        boolean compr = false;
        List<Integer> listta = new ArrayList<Integer>();

        //For para añadir los elementos del array a una lista para comprobar la frecuencia del numero a buscar
        for (int i : arra) {
            listta.add(i);
        }
        auxList = Collections.frequency(listta, aNu);

        //Serie de comprobaciones para determinar si se cumple o no el enunciado del ejercicio
        if (auxList != nVez) {
            compr = false;
        } else {
            for (int i = 0; i < arra.length; i++) {

                if (i == (arra.length - 1)) {
                    break;
                } else {
                    if (arra[i] ==aNu && arra[i + 1]==aNu) {
                        compr = false;
                        break;
                    } else {
                        compr = true;
                    }
                }              
            }
        }
        return compr;
    }

    public static void main(String[] args) {
        boolean comprobacion;
        int aNum = 0, nVeces = 0;
        StringBuilder sb= new StringBuilder();

        //Cambiar estos parametros para probar 
        int[] arrayInt = {3,6,3,3};
        aNum = 3;
        nVeces = 3;
        

        comprobacion = tieneNumeros(arrayInt, aNum, nVeces);
        
        //Bucle mara concatenar los numeros del array en un StringBuilder
        for (int i : arrayInt) {
            sb.append(i + " ");
        }
        
        System.out.println("Array: " + sb + "  num a buscar: " + aNum + " \t Numero de veces que deberia estar: " + nVeces);
        
        if (comprobacion==true) {
            System.out.println("true");
        }else{
           
            System.out.println("false");
        }
        
    }
}
