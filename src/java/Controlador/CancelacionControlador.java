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

    public CancelacionControlador() {
    }

    public Cancelacion getCancelacion() {
        return cancelacion;
    }

    public void setCancelacion(Cancelacion cancelacion) {
        this.cancelacion = cancelacion;
    }

    
    public void agregar() {
        try {
            cancelacionFacade.create(cancelacion);
            cancelacion = new Cancelacion();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
      
    
    public void eliminar() {
        try {
            cancelacionFacade.remove(cancelacion);
            cancelacion = new Cancelacion();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public void editar() {
        try {
            cancelacionFacade.edit(cancelacion);
            cancelacion = new Cancelacion();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public void finAll() {
            cancelacionFacade.findAll();
    }
    
    public void find(Cancelacion cancelacion) {
        try {
            cancelacionFacade.find(cancelacion);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
}
