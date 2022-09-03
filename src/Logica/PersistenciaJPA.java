/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

import Persistencia.ControladorPersistencia;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PersistenciaJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Persona persona = new Persona("488541236", "Jorge", "Lopez Lujan","9641414" ,new Date ("08/27/2022"));
        Persona persona = new Persona("123", "Jorge", "Lopez Lujan","9641414" ,new Date ("08/27/2022"));
        ControladorPersistencia control = new ControladorPersistencia();
        //control.crearPersona(persona);
        
       // control.eliminarPersona("123");
       
      // persona.setNombre("Joaquin");
      // persona.setApellido("De la cruz");
      // persona.setTelefono("41647");
      // control.modificarPersona(persona);
      
      /*
            List<Persona>listaPersona = control.listarPersonas();
            System.out.println("Lista de Personas de la Base de Datos : ");
            System.out.println("--------------------------------");
            
            for(Persona p: listaPersona){
                System.out.println("DNI: "+p.getDni());
                System.out.println("NOMBRE: "+p.getNombre());
                System.out.println("APELLIDO: "+p.getApellido());
                System.out.println("TELEFONO: "+p.getTelefono());
                System.out.println("FECHA DE NACIMIENTO: "+p.getFechaNac());     
                System.out.println("--------------------------------");
           }
        */
      
      Persona p = control.listaPersona("123");
      
                System.out.println("DNI: "+p.getDni());
                System.out.println("NOMBRE: "+p.getNombre());
                System.out.println("APELLIDO: "+p.getApellido());
                System.out.println("TELEFONO: "+p.getTelefono());
                System.out.println("FECHA DE NACIMIENTO: "+p.getFechaNac());     
        
    }
    
 
}
