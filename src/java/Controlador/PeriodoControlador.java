/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Periodo;
import Persistencia.PeriodoFacade;
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
@Named(value = "periodoControlador")
@SessionScoped
public class PeriodoControlador implements Serializable {

    /**
     * Creates a new instance of PeriodoControlador
     */
    @EJB
    private PeriodoFacade periodoFacade;
    private Periodo periodo = new Periodo();
    
    public PeriodoControlador() {
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
    
    public void registrar() {
        try {
            periodoFacade.create(this.periodo);
            periodo = new Periodo();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,e.getMessage(),"Debe completar todos los campos obligatorios"));
        }
    }
    
}
