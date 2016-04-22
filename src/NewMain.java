
import Usuarios.Socio;
import Usuarios.Alumno;
import Usuarios.Profesor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erley
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Socio socio = new Socio();
        Alumno erley = new Alumno();
        Profesor boris = new Profesor();
        Libro libro = new  LibroFinder().LibroFinder(socio, "Cien Años de soledad");
        System.out.println(libro.getEstado());
                
    }
    
}
