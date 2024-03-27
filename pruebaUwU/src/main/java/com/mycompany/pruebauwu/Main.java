/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebauwu;

/**
 *
 * @author Alumno
 */
public class Main {
    public static void main(String[]args){
        Persona p1 = new Persona();
        p1.SetNombre("Marco");
        p1.SetApellido("Zapana");
        p1.SetEdad(19);
        
        System.out.printIn("Mi nombre es: "+ p1.getNombre());
        
    }
}
