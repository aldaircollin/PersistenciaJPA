package Persistencia;

import Logica.Persona;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorPersistencia {
    
    PersonaJpaController perJPA = new PersonaJpaController();

    public void crearPersona(Persona persona) {

        try {
            perJPA.create(persona);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void eliminarPersona(String id) {
        try {
            perJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarPersona(Persona persona) {
        
        try {
            perJPA.edit(persona);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Persona> listarPersonas() {
       List<Persona>listaPersonas = perJPA.findPersonaEntities();
       return listaPersonas;
    }

    public Persona listaPersona(String id) {
    Persona p = perJPA.findPersona(id);
    return p;
    }
    
}
