


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
public class BuenoNuevoRegularStrategy implements LibrosStrategy{

    @Override
    public Libro findLibro(String titulo) {
       ArrayList<Libro> libros = Biblioteca.obtenerLibros();
       
       // Algorirmo BuenoNuevoRegular
       Libro libro = new Libro();
       libro.setEstado("Bueno");
       return libro;
       
    }
    
}
