/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Sancion;
import Persistencia.SancionFacade;
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
@Named(value = "sancionControlador")
@SessionScoped
public class SancionControlador implements Serializable {

    /**
     * Creates a new instance of SancionControlador
     */
    @EJB
    private SancionFacade sancionfacade;
    
    private Sancion sancion = new Sancion();
    
    public SancionControlador() {
    }

    public Sancion getSancion() {
        return sancion;
    }

    public void setSancion(Sancion sancion) {
        this.sancion = sancion;
    }
    
    public void registrar(){
        try{
        this.sancionfacade.create(sancion);
        sancion = new Sancion();
        }catch(Exception e){
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public void eliminar(){
        try{
        this.sancionfacade.remove(sancion);
        sancion = new Sancion();
        }catch(Exception e){
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public void editar(){
        try{
        this.sancionfacade.edit(sancion);
        sancion = new Sancion();
        }catch(Exception e){
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public List<Sancion> findall(){
        return sancionfacade.findAll();
    }
    
    
}
