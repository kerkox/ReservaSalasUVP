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
    
}
