/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Romel
 */
public class Principal {
    //var c=8;//no vaildo en atributos
    public static void main (String [] arg){
        
        var numero= 9;
        //numero="hola";//no se puede asignar una variable de tipo diferente a la declarada primero
        ArrayList datos=new ArrayList<Integer>();
        
        datos.add(20);
        datos.add(30);
        datos.add(40);
        datos.add(numero);
        
        System.out.println("Entero-"+numero);
        numero=6;
        System.out.println("Entero-"+numero);
        System.out.println(datos);
       
        var copia= List.copyOf(datos);
        
        System.out.println("Copia-"+copia);
        
        datos.add(50);
        
        System.out.println(datos);
        
        //copia.add(80);//No se puede modificar la copia
    }
}
