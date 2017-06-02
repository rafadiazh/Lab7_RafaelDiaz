/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_rafaeldiaz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class AdminProductos {
    ArrayList <Productos> listaproductos = new ArrayList();
    
    File archivo = null;

    public AdminProductos(String path) {
        archivo = new File(path);
    }

    public AdminProductos() {
    }

    
    
    public ArrayList<Productos> getListaproductos() {
        return listaproductos;
    }

    public void setListaproductos(ArrayList<Productos> listaproductos) {
        this.listaproductos = listaproductos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaproductos=" + listaproductos;
    }

    

    public void setPersona(Productos p) {
        this.listaproductos.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Productos t : listaproductos) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getCategoria() + ";");
                bw.write(t.getPrecio() + ";");
                bw.write(t.getDescuento() + ";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaproductos = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                listaproductos.add(new Productos(sc.next(), sc.next(), sc.nextDouble(),sc.nextDouble()));
            }
        } catch (Exception e) {
        }
        sc.close();

    }
}
