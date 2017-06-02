/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_rafaeldiaz;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Clientes {
    ArrayList <Productos> productos = new ArrayList();
    String nombre;
    int edad;

    public Clientes() {
    }

    public Clientes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
