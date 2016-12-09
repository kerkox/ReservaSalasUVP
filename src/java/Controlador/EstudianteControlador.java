/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Estudiante;
import Persistencia.EstudianteFacade;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author PC
 */
@Named(value = "estudianteControlador")
@ViewScoped
public class EstudianteControlador implements Serializable {


    @EJB
    private EstudianteFacade estudiantefacade; 
    private Estudiante estudiante ;
    
    
    public EstudianteControlador() {
        estudiante= new Estudiante();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    
    public void registrar() {
        try {
            estudiantefacade.create(estudiante);
            estudiante = new Estudiante();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,e.getMessage(),"Debe completar todos los campos obligatorios"));
        }
    }
    
    public void eliminar(Estudiante estudiante) {

            estudiantefacade.remove(estudiante);
            estudiante = new Estudiante();
       
    }
    
    public void editar(Estudiante estudiante) {
        try {
            estudiantefacade.edit(estudiante);
            estudiante = new Estudiante();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public List<Estudiante> findall() {
            return estudiantefacade.findAll();
    }
    
}
