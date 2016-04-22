
import Usuarios.Socio;
import Usuarios.Profesor;
import Usuarios.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erley
 */
public class LibroFinder {

    public Libro LibroFinder(Persona persona, String titulo) {
      LibrosStrategy strategy = null;
      
      if(persona instanceof Socio){
          strategy= new NuevoBuenoRegularStrategy();
      } else if(persona instanceof Profesor){
          strategy = new BuenoNuevoRegularStrategy();
      }else{
          strategy = new RegularBuenoNuevoStrategy();
      }
      
      return strategy.findLibro(titulo);
    }
    
    
}
