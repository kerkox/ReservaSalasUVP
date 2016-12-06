/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Cancelacion;
import Persistencia.CancelacionFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author fusm-cat-palmira
 */
@Named(value = "cancelacionControlador")
@SessionScoped
public class CancelacionControlador implements Serializable {

    /**
     * Creates a new instance of CancelacionControlador
     */
    
    private Cancelacion cancelacion = new Cancelacion();
    
    @EJB
    private CancelacionFacade cancelacionFacade;
    
    
    public void agregar(Cancelacion cancelacion) {
        try {
            cancelacionFacade.create(cancelacion);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
      
    
    public void eliminar(Cancelacion cancelacion) {
        try {
            cancelacionFacade.remove(cancelacion);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public void editar(Cancelacion cancelacion) {
        try {
            cancelacionFacade.edit(cancelacion);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public void finAll() {
        try {
            cancelacionFacade.findAll();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public void find(Cancelacion cancelacion) {
        try {
            cancelacionFacade.find(cancelacion);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
}
