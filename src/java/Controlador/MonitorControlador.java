/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Monitor;
import Persistencia.MonitorFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author paulker
 */
@Named(value = "monitorControlador")
@SessionScoped
public class MonitorControlador implements Serializable {

    /**
     * Creates a new instance of MonitorControlador
     */
    @EJB
    private MonitorFacade monitorFacade;
    private Monitor monitor = new Monitor();
    
    
    public MonitorControlador() {
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    
    
    public void registrar() {
        try {
            monitorFacade.create(monitor);
            monitor = new Monitor();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios ","Debe completar todos los campos obligatorios"));
        }
    }
    
    public void eliminar() {
        try {
            monitorFacade.remove(monitor);
            monitor = new Monitor();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public void editar() {
        try {
            monitorFacade.edit(monitor);
            monitor = new Monitor();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public List<Monitor> findall(){
        return monitorFacade.findAll();
    }
    
}
