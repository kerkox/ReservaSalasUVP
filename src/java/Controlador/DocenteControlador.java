/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Cancelacion;
import Logica.Docente;
import Persistencia.DocenteFacade;
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
@Named(value = "docenteControlador")
@SessionScoped
public class DocenteControlador implements Serializable {

    /**
     * Creates a new instance of DocenteControlador
     */
    
    private Docente docente = new Docente();
    
    @EJB
    private DocenteFacade docentefacade;
    
    public DocenteControlador() {
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    
    public void agregar() {
        try {
            docentefacade.create(this.docente);
            docente = new Docente();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
      
    
    public void eliminar(Docente docente) {
        try {
            docentefacade.remove(docente);
            docente = new Docente();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public void editar(Docente docente) {
        try {
            docentefacade.edit(docente);
            docente = new Docente();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public void findAll(){
            docentefacade.findAll();
    }
    
    public void find(Docente docente) {
        try {
            docentefacade.find(docente);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    
}
