/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Reserva;
import Persistencia.ReservaFacade;
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
@Named(value = "reservaControlador")
@SessionScoped
public class ReservaControlador implements Serializable {

    /**
     * Creates a new instance of ReservaControlador
     */
    @EJB
    private ReservaFacade reservaFacade;
    private Reserva reserva = new Reserva();
    
    
    public ReservaControlador() {
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    public void registrar(){
        try{
        this.reservaFacade.create(reserva);
        reserva = new Reserva();
        }catch(Exception e){
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public void eliminar(Reserva reserva){
        try{
        this.reservaFacade.remove(reserva);
        reserva = new Reserva();
        }catch(Exception e){
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public void editar(Reserva reserva){
        try{
        reservaFacade.edit(reserva);
        reserva = new Reserva();
        }catch(Exception e){
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public List<Reserva> findall(){
        return reservaFacade.findAll();
    }
    
    
}
