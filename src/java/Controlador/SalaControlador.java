/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Sala;
import Persistencia.SalaFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author paulker
 */
@Named(value = "salaControlador")
@SessionScoped
public class SalaControlador implements Serializable {

    /**
     * Creates a new instance of SalaControlador
     */
    @EJB
    private SalaFacade salaFacade;
    private Sala sala = new Sala();
    
    public SalaControlador() {
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    public void agregar() {
        try {
            salaFacade.create(this.sala);
            sala = new Sala();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
      
    
    public void eliminar() {
        try {
            salaFacade.remove(this.sala);
            sala = new Sala();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public void editar() {
        try {
            salaFacade.edit(this.sala);
            sala = new Sala();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public void findAll(){
            salaFacade.findAll();
    }
    
    public void find(Sala sala) {
        try {
            salaFacade.find(sala);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    
}
