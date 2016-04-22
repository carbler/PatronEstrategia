
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erley
 */
public class Biblioteca {
    private static ArrayList<Libro> libros= new ArrayList<Libro>();
    
    public Biblioteca(){
        Libro libro = new Libro();
        libro.setEstado("Bueno");
        libro.setTitulo("Un titulo");
        
        libros.add(libro);
    }
    
    public static ArrayList<Libro> obtenerLibros(){
        return libros;
    }
}
