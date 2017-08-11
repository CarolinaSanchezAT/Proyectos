/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.animales;

class Animal{
    String nombre;
    String reino;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public Animal(String nombre,String reino) {
        this.nombre = nombre;
    } 
    Animal reproducirse (Animal animal)
    {
        if (!(animal instanceof Gato)){
            System.out.println("No se puede reproducir)");
        }
            Gato gato = new Gato ("Gato bebe");
       return gato;
    }
}

class Gato extends Animal{
    
    public Gato(String nombre) {
        super(nombre);
    }
    
}

class Perro extends Animal{

    public Perro(String nombre) {
        super(nombre);
    }
}
 

public class TestAnimales {
    public static void main(String[] args) {
        Perro p = new Perro("Scobi doo");
        Gato g = new Gato ("Benito");
        System.out.println("Nuevo hijo" + g.reproducirse(g));
    }
}
